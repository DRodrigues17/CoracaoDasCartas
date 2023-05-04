import React from 'react';
import './style.css';
import github from '../../../assets/img/github.svg';

export default function Footer() {
  return (
    <footer class="site-identity footer-container">
      <div class="footer-line" />
      <a class="criador" href="https://github.com/DRodrigues17" target="_blank" rel="noreferrer">
        <img src={github} alt="" />
        <p>/DRodrigues17</p>
      </a>
    </footer>

  );
}