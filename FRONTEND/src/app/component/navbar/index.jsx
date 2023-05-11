import React from 'react';
import './style.css';
import enigma from '../../../assets/img/enigma-milenio.svg';
import { Link } from 'react-router-dom';
import BotaoLinkagem from '../botao-linkagem';

export default function Navbar() {
  return (
    <nav className='site-identity container'>
      <Link to={"/"} class="logo">
        <img class="img" src={enigma} alt='' />
        <p>Coração das cartas</p>
      </Link>
      <div className='botoes'>
        <BotaoLinkagem url='/buscar-carta' texto='Busque por uma carta' />
        <BotaoLinkagem url='/criar-conta' texto='Crie sua Conta' />
        <BotaoLinkagem url='/login' texto='Faça Login' />
      </div>
      <div class="line"></div>
    </nav>
  );
}