import { Component, OnInit, Input } from '@angular/core';

@Component({
	selector: 'text-group',
	templateUrl: './text-group.component.html',
	styleUrls: ['./text-group.component.scss']
})
export class TextGroupComponent implements OnInit {

	@Input() id: String;
	@Input() label: String;
	@Input() placeholder: String;
	@Input() value: String;

	constructor() { }

	ngOnInit() {
		if(this.placeholder == null)
			this.placeholder = this.label;
	}

}
