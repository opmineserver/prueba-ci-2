import { Component, OnInit } from '@angular/core';
import { Player } from '../models/player';
import { PlayerService } from '../services/player.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.scss']
})
export class GameComponent implements OnInit {

  public players: Player[];

  constructor(private playerService: PlayerService, private route: ActivatedRoute) { 
    var self = this;
    this.route.params.subscribe(function (params) {
      self.playerService.getPlayers(params['id'], function (data) {
        self.players = <Player[]>data;
      })
    });
  }

  ngOnInit() {
  }

  public start(id) {
  }

}
