import React from 'react';
import './style.css';
import enigma from '../../../assets/img/enigma-milenio.svg';
import { Link } from 'react-router-dom';
import BotaoLinkagem from '../botao-linkagem';

export default function Navbar() {
  return (
    <nav className='site-identity container'>
      <Link to={"/"} className="logo">
        <img className="img" src={enigma} alt='' />
        <p className='texto-navbar'>Coração das cartas</p>
      </Link>
      <div className='botoes'>
        <BotaoLinkagem url='/buscar-carta' texto='Busque por uma carta' />
        <BotaoLinkagem url='/criar-conta' texto='Crie sua Conta' />
        <BotaoLinkagem url='/login' texto='Faça Login' />
      </div>
      <div className="line"></div>
    </nav>
  );
}