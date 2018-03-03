import { environment } from './../../environments/environment';
import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Player } from '../models/player';

@Injectable()
export class PlayerService {

  private player: Player;

  constructor(private http: HttpClient) { 
    this.player = new Player("");
  }

  public create(name: String) {
    this.player = new  Player(name);
  }

  public getPlayer(): Player {
    return this.player;
  }

  public getPlayers(gameId: number, callback: Function) {
    this.http.get(environment.baseApi + "player/list?gameId=" + gameId).subscribe(data => callback(data));
  }

  public join(gameId: number, callback: Function) {
    this.http.get(environment.baseApi + "player/join?gameId=" + gameId + "&name=" + this.player.name).subscribe(data => callback());
  }
}
