import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { JoinerComponent } from './joiner/joiner.component';
import { InTextComponent } from './forms/in-text/in-text.component';
import { InButtonComponent } from './forms/in-button/in-button.component';
import { FormComponent } from './forms/form/form.component';
import { TextGroupComponent } from './forms/text-group/text-group.component';


@NgModule({
  declarations: [
    AppComponent,
    JoinerComponent,
    InTextComponent,
    InButtonComponent,
    FormComponent,
    TextGroupComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
