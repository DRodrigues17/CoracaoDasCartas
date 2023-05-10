import React from 'react';
import './style.css';
import { Link } from 'react-router-dom';

export default function BotaoLinkagem(props : any) {


  return (
    <Link to={props.url} className='botao'>{props.texto}</Link>
  );

}