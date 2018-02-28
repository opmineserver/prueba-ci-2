package com.example.demo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Game;
import com.example.demo.services.GameService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {

	@Autowired
	private GameService gameService;
	
    @Test
    public void create() {
    	Game g = gameService.create("nombre");
    	Game g2 = gameService.findOne(g.getId());
    	Assert.assertEquals(g2.getId(), g.getId());
    }
}
