import { NgModule } from '@angular/core';
import {Routes, RouterModule} from "@angular/router";
import {HomePageComponent} from "./components/screens/home-page/home-page.component";
import {TelaCriarContaComponent} from "./components/screens/tela-criar-conta/tela-criar-conta.component";
import {TelaLoginComponent} from "./components/screens/tela-login/tela-login.component";


const routes: Routes = [
  { path:'', component: HomePageComponent },
  { path:'/criar-conta', component: TelaCriarContaComponent },
  { path:'/login', component: TelaLoginComponent }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
