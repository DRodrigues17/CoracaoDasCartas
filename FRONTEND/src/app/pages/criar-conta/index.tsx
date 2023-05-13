import React from "react";

import './style.css';
import exodia from "../../../assets/img/exodia.svg";
import BotaoLinkagem from "../../component/botao-linkagem";

export default function CriarConta() {
    return (
        <div className="content-area">
            <h1 className="titulo-tela">Informe seus dados para Criar a sua Conta</h1>
            <div className="telas-conteudo-estatico">
                <img src={exodia} alt="" className="imagens-tela" />
                <label className="area-inputs">
                    <input type="text" placeholder="nome" className="inputs" />
                    <input type="text" placeholder="email" className="inputs" />
                    <input type="text" placeholder="senha" className="inputs" />
                    <BotaoLinkagem texto="criar a conta" />
                </label>
            </div>
        </div>
    )
}