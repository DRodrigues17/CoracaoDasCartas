import React, { Component } from 'react';
import './style.css';
import { Link } from 'react-router-dom';

export default function BotaoHistoriaJogo() {
  return (
    <Link to={"/historia-jogo"} className='botao'>História do Jogo</Link>
  );

}