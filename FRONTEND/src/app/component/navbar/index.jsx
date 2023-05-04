import React from 'react';
import './style.css';
import enigma from '../../../assets/img/enigma-milenio.svg';
import BotaoLogin from '../button/botao-login';
import BotaoCriarConta from '../button/botao-criar-conta';
import BotaoBuscarCarta from '../button/botao-buscar-carta';
import { Link } from 'react-router-dom';

export default function Navbar() {
  return (
    <nav className='site-identity container'>
      <Link to={"/"} class="logo">
        <img class="img" src={enigma} alt='' />
        <p>Coração das cartas</p>
      </Link>
      <div className='botoes'>
        <BotaoBuscarCarta />
        <BotaoCriarConta />
        <BotaoLogin />
      </div>
      <div class="line"></div>
    </nav>
  );
}