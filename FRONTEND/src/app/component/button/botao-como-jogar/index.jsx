import React from 'react';
import './style.css';
import { Link } from 'react-router-dom';

export default function BotaoComoJogar() {
  return (
    <Link to={"/como-jogar"} className='botao'>Como Jogar</Link>
  );

}