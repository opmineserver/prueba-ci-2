package com.example.demo.controllers;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexControllers {

	@GetMapping("/")
	public String index(@RequestParam String path) {
		StringBuilder sb = new StringBuilder();
		try {
			path = path.isEmpty() ? "." : path;
			File[] files = new File(path).listFiles();
			sb.append("<ul>");
			sb.append("<li><a href='/file?path=" + new File("..").getCanonicalPath().replace("\\", "%2F") + "'>..</a></li>");
			for(File file : files) {
				sb.append("<li>");
				if(file.isFile())
					sb.append("<a href='/file?path=" + file.getCanonicalPath().replace("\\", "%2F") + "'>" + file.getName() + "</a>");
				else
					sb.append("<b><a href='/?path=" + file.getCanonicalPath().replace("\\", "%2F") + "'>" + file.getName() + "</a></b>");
				sb.append("</li>");
			}
			sb.append("</ul>");
		} catch(Throwable t) {
			StringWriter errors = new StringWriter();
			t.printStackTrace(new PrintWriter(errors));
			sb.setLength(0);
			sb.append(errors.toString().replace("\n", "<br>"));
			t.printStackTrace();
		}
		
		return sb.toString();
	}
	
	@GetMapping("/file")
	public @ResponseBody byte[] file(@RequestParam String path) {
		try {
			Path paths = Paths.get(path);
			return Files.readAllBytes(paths);
		} catch(Throwable t) {
			StringBuilder sb = new StringBuilder();
			StringWriter errors = new StringWriter();
			t.printStackTrace(new PrintWriter(errors));
			sb.setLength(0);
			sb.append(errors.toString());
			return sb.toString().getBytes();
		}
	}
	
}
