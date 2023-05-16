import React, { useEffect, useState } from "react";

import './style.css';
import magoSombrio from "../../../assets/img/MagoSombrio.svg";
import BotaoLinkagem from "../../component/botao-linkagem";
import { fazerLogin } from "../../api/ContaClient";
import { CorpoRequestLogin } from "../../interface/conta/CorpoRequestLogin";

export default function TelaLogin() {

    let corpoRequisicao: CorpoRequestLogin = {
        email: "",
        senha: ""
    }

    const [mensagem, setMensagem] = useState('')

    // depois enviar pra requisição
    // deepois mostrar o retorno da requisição na tela

    // useEffect(() => {
    //buscarCartas.then(response => {
    //  console.log(response.data)
    //setCartas(response.data.content)
    //})
    //  .catch(error => {
    //  console.log(error)
    //})
    //}, [])


    function mudarEmail(event: any) {
        corpoRequisicao.email = event.target.value;
        console.log(corpoRequisicao.email)
    }

    function mudarSenha(event: any) {
        corpoRequisicao.senha = event.target.value;
        console.log(corpoRequisicao.senha)
    }

    function testarRequisicao(): any {
        console.log(fazerLogin(corpoRequisicao.email, corpoRequisicao.senha))
    }



    return (
        <div className="content-area">
            <h1 className="titulo-tela">Informe seus dados para efeturar o login</h1>
            <div className="telas-conteudo-estatico">
                <img src={magoSombrio} alt="" className="imagens-tela" />
                <div className="caixa-interativa">
                    <p>{mensagem}</p>
                    <label className="area-inputs ">
                        <input type="text" placeholder="email" className="inputs" onChange={event => mudarEmail(event)} />
                        <input type="text" placeholder="senha" className="inputs" onChange={event => mudarSenha(event)} />
                        <button className="botao" onClick={testarRequisicao()}>Logar</button>
                    </label>
                    <BotaoLinkagem url="/criar-conta" texto="novo por aqui? crie sua conta" />
                </div>
            </div>
        </div>
    )
}