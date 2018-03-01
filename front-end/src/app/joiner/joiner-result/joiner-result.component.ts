import { Game } from './../../models/game';
import { Component, OnInit } from '@angular/core';

@Component({
	selector: 'joiner-result',
	templateUrl: './joiner-result.component.html',
	styleUrls: ['./joiner-result.component.scss']
})
export class JoinerResultComponent implements OnInit {

	games: Game[] = [
		new Game("Juego 1", 8),
		new Game("Juego 2", 0),
		new Game("Juego 3", 2),
		new Game("Juego 4", 13)
	];

	constructor() { }

	ngOnInit() {
	}

}
