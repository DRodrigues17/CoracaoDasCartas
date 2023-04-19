import React from 'react';
import './style.css';
import enigma from '../../../assets/img/enigma-milenio.svg';
import Button from '../button';

export default function Navbar() {
  return (
    <div className='site-identity container'>
      <div class="logo">
        <img class="img" src={enigma} alt='' />
        <p>Coração das cartas</p>
      </div>
      <div className='botoes'>
        <Button />
        <Button />
        <Button />
      </div>
      <div class="line"></div>
    </div>
  );
}