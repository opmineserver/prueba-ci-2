import { PlayerService } from './player.service';
import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { environment } from '../../environments/environment';

@Injectable()
export class GameService {

  constructor(private http: HttpClient, private playeService: PlayerService) { }

  public create(name: String) {
    this.http.get(environment.baseApi + "game/create");
  }

  public search(name: String, ok: Function, not: Function) {
    this.http.get(environment.baseApi + "game/search?name=" + name).subscribe(function(data) {
      if(data['id']==0)
        not();
      else
        ok(data['id']);
    });
  }

}
