import React from "react";

import './style.css';
import exodia from "../../../assets/img/exodia.svg";
import BotaoLinkagem from "../../component/botao-linkagem";
import { criarConta } from "../../api/ContaClient";
import { Conta } from "../../interface/conta/Conta";

export default function CriarConta() {

    let conta: Conta = {
        nomeDeUsuario: "DRodrigues17",
        email: "adaniel17@gmail.com",
        senha: "senha"
    }


    console.log(criarConta(conta))


    return (
        <div className="content-area">
            <h1 className="titulo-tela">Informe seus dados para Criar a sua Conta</h1>
            <div className="telas-conteudo-estatico">
                <img src={exodia} alt="" className="imagens-tela" />
                <div className="caixa-interativa">
                    <label className="area-inputs">
                        <input type="text" placeholder="nome" className="inputs" />
                        <input type="text" placeholder="email" className="inputs" />
                        <input type="text" placeholder="senha" className="inputs" />
                        <button className="botao"> Efetuar cadastro</button>

                    </label>
                    <BotaoLinkagem url="/login" texto="já tem conta? faça login" />
                </div>

            </div>
        </div>
    )
}