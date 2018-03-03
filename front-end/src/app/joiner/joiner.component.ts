import { PlayerService } from './../services/player.service';
import { GameService } from './../services/game.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
	selector: 'joiner',
	templateUrl: './joiner.component.html',
	styleUrls: ['./joiner.component.scss']
})
export class JoinerComponent implements OnInit {

	constructor(private router: Router, private gameService: GameService, private playerService: PlayerService) { }

	ngOnInit() {
	}

	public changeName() {
		this.router.navigate(['']);
	}

	public join() {
		var router = this.router;
		var playerService = this.playerService;
		this.gameService.search((<HTMLInputElement>document.getElementById('s-game-in')).value, function(id) {
			playerService.join(id, function() {
				router.navigate(['game', id]);
			})
		}, function(){});
	}
}
