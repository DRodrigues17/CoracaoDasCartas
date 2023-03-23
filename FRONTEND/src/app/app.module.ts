import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import {AppRoutingModule} from './app-routing.module';

import {AppComponent} from './app.component';
import {CriarContaButtonComponent} from './components/botoes/criar-conta-button/criar-conta-button.component';
import {TelaLoginComponent} from './components/screens/tela-login/tela-login.component';
import {TelaCriarContaComponent} from './components/screens/tela-criar-conta/tela-criar-conta.component';
import {HomePageComponent} from './components/screens/home-page/home-page.component';
import {NavbarComponent} from './components/navbar/navbar.component';
import {RouterLink, RouterOutlet} from "@angular/router";
import {BuscarCartasComponent} from './components/botoes/home-page-button/./buscar-cartas.component';
import {LoginButtonComponent} from './components/botoes/login-button/login-button.component';
import {FooterComponent} from './components/footer/footer.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { ComoJogarComponent } from './components/screens/como-jogar/como-jogar.component';
import { HistoriaDoJogoComponent } from './components/screens/historia-do-jogo/historia-do-jogo.component';

@NgModule({
  declarations: [
    AppComponent,
    CriarContaButtonComponent,
    TelaLoginComponent,
    TelaCriarContaComponent,
    HomePageComponent,
    NavbarComponent,
    BuscarCartasComponent,
    LoginButtonComponent,
    FooterComponent,
    ComoJogarComponent,
    HistoriaDoJogoComponent
  ],
  imports: [
    BrowserModule,
    RouterLink,
    RouterOutlet,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
