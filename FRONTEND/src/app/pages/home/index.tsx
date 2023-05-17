import React from 'react';
import './style.css';
import BotaoLinkagem from '../../component/botao-linkagem';

export default function Home() {
  return (
    <div className='content-area home'>
      <BotaoLinkagem url='/historia-jogo' texto='História do Jogo' />
      <BotaoLinkagem url='/como-jogar' texto='Como Jogar' />
      <BotaoLinkagem url='/buscar-carta' texto='Busque por uma carta' />
    </div>
  );
}