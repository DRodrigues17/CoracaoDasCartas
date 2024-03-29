import React from 'react';
import './style.css';
import yamiyugi from '../../../assets/img/YamiYugi.svg';
import yami from '../../../assets/img/YugiMuto.svg';

export default function ComoJogar() {
  return (
    <div className='content-area'>
      <h1 className='titulo-tela'>Como jogar</h1>
      <div className='telas-conteudo-estatico'>
        <img src={yamiyugi} alt="" className='imagens-tela'/>
        <p className='texto-estatico'>
          Yu-Gi-Oh! narra a história de Yugi Muto, um garoto tímido que ama todos os tipos de jogos, mas muitas vezes é intimidado ao seu redor. Um dia, ele ganha peças fragmentadas de um antigo artefato egípcio, o Enigma do Milênio Millennium Puzzle (千年パズル Sennen Pazuru?), por seu avô Solomon Muto (武藤双六 Mutō Sugoroku?). Ao remontar o quebra-cabeça, seu corpo acolhe um espírito misterioso com a personalidade de um jogador. A partir desse momento, sempre que Yugi ou um de seus amigos é ameaçado por aqueles com escuridão em seus corações, este outro Yugi se manifesta e os desafia os perigosos Jogos da Sombra (闇 の ゲ ー ム Yami no Gēmu?), que revelam a verdadeira natureza do coração de alguém, os perdedores dessas competições geralmente são submetidos a um castigo escuro chamado Jogo da Penalidade (千年パズル Batsu Gēmu?).

          Enquanto a série avança, Yugi e seus amigos descobrem que esta pessoa dentro de seu enigma é realmente o espírito de um Faraó sem nome dos tempos egípcios que tinha perdido suas memórias. Como Yugi e seus companheiros tentam ajudar o faraó a recuperar suas memórias, eles encontram-se passando por muitas provações enquanto eles apostam suas vidas lutando contra os jogadores que exercem os misteriosos itens do Milênio e o poder sombrio dos Jogos das Sombras.

          Os primeiros capítulos apresentam uma variedade de jogos diferentes, mas a partir do arco "Reino dos Duelistas" o foco é deslocado para o Monstros de Duelo. Esse jogo é jogado com um sistema de imagem holográfica criado por Seto Kaiba (após sua primeira partida com Yugi).
        </p>
        <img src={yami} alt="" className='imagens-tela'/>
      </div>
    </div>
  );
}