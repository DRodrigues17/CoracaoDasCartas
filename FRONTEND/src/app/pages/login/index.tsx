import React from "react";

import './style.css';
import magoSombrio from "../../../assets/img/MagoSombrio.svg";
import BotaoLinkagem from "../../component/botao-linkagem";

export default function TelaLogin() {
    return (
        <div className="content-area">
            <h1 className="titulo-tela">Informe seus dados para efeturar o login</h1>
            <div className="telas-conteudo-estatico">
                <img src={magoSombrio} alt="" className="imagens-tela" />
                <div className="caixa-interativa">
                    <label className="area-inputs ">
                        <input type="text" placeholder="email" className="inputs" />
                        <input type="text" placeholder="senha" className="inputs" />
                        <button className="botao">Logar</button>
                    </label>
                    <BotaoLinkagem url="/criar-conta" texto="novo por aqui? crie sua conta" />
                </div>
            </div>
        </div>
    )
}