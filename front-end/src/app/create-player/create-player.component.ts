import { PlayerService } from './../services/player.service';
import { Component, OnInit } from '@angular/core';
import { GameService } from '../services/game.service';
import { Router } from '@angular/router';

@Component({
  selector: 'create-player',
  templateUrl: './create-player.component.html',
  styleUrls: ['./create-player.component.scss']
})
export class CreatePlayerComponent implements OnInit {

  constructor(private playerService: PlayerService, private router: Router) { }

  ngOnInit() {
  }

  public enter() {
    var name = (<HTMLInputElement>document.getElementById('s-player-in')).value;
    console.log(name);
    this.playerService.create(name);
    this.router.navigate(['searchGame']);
  }

  public getPlayer(): String {
    return this.playerService.getPlayer().name;
  }

}
