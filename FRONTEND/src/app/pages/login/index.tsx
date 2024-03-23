import { useState } from "react";

import { Button } from "antd";
import magoSombrio from "../../../assets/img/MagoSombrio.svg";
import { fazerLogin } from "../../api/ContaClient";
import { CorpoRequestLogin } from "../../interface/conta/CorpoRequestLogin";
import "./style.css";

export default function TelaLogin() {
  let corpoRequisicao: CorpoRequestLogin = {
    email: "",
    senha: "",
  };

  const [mensagem, setMensagem] = useState("");

  function mudarEmail(event: any) {
    corpoRequisicao.email = event.target.value;
  }

  function mudarSenha(event: any) {
    corpoRequisicao.senha = event.target.value;
  }

  async function logar() {
    try {
      console.log(corpoRequisicao.email);
      console.log(corpoRequisicao.senha);
      const { data } = await fazerLogin(
        corpoRequisicao.email,
        corpoRequisicao.senha
      );

      console.log(data);
      setMensagem(`o usuario ${data.nomeDeUsuario} logou com sucesso`);
    } catch (error) {
      console.log(error);
    }
  }

  return (
    <div className="content-area">
      <h1 className="titulo-tela">Informe seus dados para efeturar o login</h1>
      <div className="telas-conteudo-estatico">
        <img src={magoSombrio} alt="" className="imagens-tela" />
        <div className="caixa-interativa">
          <p>{mensagem}</p>
          <label className="area-inputs ">
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
            <Button type="primary" className="botao" onClick={logar}>
              Logar
            </Button>
          </label>
          <Button type="primary" href={"/criar-conta"} className="botao">
            Novo por aqui? crie sua conta
          </Button>
        </div>
      </div>
    </div>
  );
}
