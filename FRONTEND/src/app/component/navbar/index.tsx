import { Link } from "react-router-dom";
import enigma from "../../../assets/img/enigma-milenio.svg";
import { Button } from 'antd';
import "./style.css";

export default function Navbar() {
  return (
    <nav className="site-identity container">
      <Link to={"/"} className="logo">
        <img className="img" src={enigma} alt="" />
        <p className="texto-navbar">Coração das cartas</p>
      </Link>
      <div className="botoes">
        <Button type="primary" href={"/buscar-carta"} className="botao">Busque por uma carta</Button>
        <Button type="primary" href={"/criar-usuario"} className="botao">Crie sua Conta</Button>
        <Button type="primary" href={"/login"} className="botao">Faça Login</Button>
      </div>
      <div className="line"></div>
    </nav>
  );
}
