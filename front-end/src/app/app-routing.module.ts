import { GameComponent } from './game/game.component';
import { CreatePlayerComponent } from './create-player/create-player.component';
import { JoinerComponent } from './joiner/joiner.component';
import { Routes, RouterModule } from "@angular/router";
import { ModuleWithProviders } from "@angular/core/src/metadata/ng_module";


const appRoutes: Routes = [
    {path: '', component: CreatePlayerComponent},
    {path: 'searchGame', component: JoinerComponent},
    {path: 'game/:id', component: GameComponent}
]

export const routes: ModuleWithProviders = RouterModule.forRoot(appRoutes);