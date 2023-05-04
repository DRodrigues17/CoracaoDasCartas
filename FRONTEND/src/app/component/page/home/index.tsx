import React from 'react';
import './style.css';
import BotaoHistoriaJogo from '../../button/botao-historia-jogo';
import BotaoComoJogar from '../../button/botao-como-jogar';
import BuscarCartas from '../../button/botao-buscar-carta';

export default function Home() {
  return (
    <div className='content-area'>
      <BotaoHistoriaJogo />
      <BotaoComoJogar />
      <BuscarCartas />
    </div>
  );
}