import { PlayerService } from './services/player.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { JoinerComponent } from './joiner/joiner.component';
import { InTextComponent } from './forms/in-text/in-text.component';
import { InButtonComponent } from './forms/in-button/in-button.component';
import { FormComponent } from './forms/form/form.component';
import { TextGroupComponent } from './forms/text-group/text-group.component';
import { JoinerResultComponent } from './joiner/joiner-result/joiner-result.component';
import { GameService } from './services/game.service';
import { routes } from './app-routing.module';
import { CreatePlayerComponent } from './create-player/create-player.component';
import { GameComponent } from './game/game.component';


@NgModule({
  declarations: [
    AppComponent,
    JoinerComponent,
    InTextComponent,
    InButtonComponent,
    FormComponent,
    TextGroupComponent,
    JoinerResultComponent,
    CreatePlayerComponent,
    GameComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    routes
  ],
  providers: [
    GameService,
    PlayerService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
