import { useState } from "react";

import { Button } from "antd";
import exodia from "../../../assets/img/exodia.svg";
import { criarConta } from "../../api/ContaClient";
import { Conta } from "../../interface/conta/Conta";
import "./style.css";

export default function CriarConta() {
  let conta: Conta = {
    nomeDeUsuario: " ",
    email: " ",
    senha: " ",
  };

  const [mensagem, setMensagem] = useState("");

  function mudarNome(event: any) {
    conta.nomeDeUsuario = event.target.value;
  }

  function mudarEmail(event: any) {
    conta.email = event.target.value;
  }

  function mudarSenha(event: any) {
    conta.senha = event.target.value;
  }

  async function criar() {
    try {
      console.log(conta.nomeDeUsuario);
      console.log(conta.email);
      console.log(conta.senha);

      const { data } = await criarConta(conta);

      console.log(data);

      setMensagem(data);
    } catch (error) {
      console.log(error);
    }
  }

  return (
    <div className="content-area">
      <h1 className="titulo-tela">Informe seus dados para Criar a sua Conta</h1>
      <div className="telas-conteudo-estatico">
        <img src={exodia} alt="" className="imagens-tela" />
        <p>{mensagem}</p>
        <div className="caixa-interativa">
          <label className="area-inputs">
            <input
              type="text"
              placeholder="nome"
              className="inputs"
              onChange={(event) => mudarNome(event)}
            />
            <input
              type="text"
              placeholder="email"
              className="inputs"
              onChange={(event) => mudarEmail(event)}
            />
            <input
              type="text"
              placeholder="senha"
              className="inputs"
              onChange={(event) => mudarSenha(event)}
            />
            <Button type="primary" className="botao" onClick={criar}>
              {" "}
              Efetuar cadastro
            </Button>
          </label>
          <Button type="primary" className="botao" href={"/login"}>
            já tem conta? faça login
          </Button>
        </div>
      </div>
    </div>
  );
}
