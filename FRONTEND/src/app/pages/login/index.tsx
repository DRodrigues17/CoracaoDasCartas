import { useState } from "react";

import { Button } from "antd";
import magoSombrio from "../../../assets/img/MagoSombrio.svg";
import { fazerLogin } from "../../api/UsuarioClient.ts";
import {UsuarioLoginRequest} from "../../interface/usuario/UsuarioLoginRequest.ts";
import "./style.css";

export default function TelaLogin() {
  const [usuario, setUsuario] = useState({} as UsuarioLoginRequest)

  const [mensagem, setMensagem] = useState("");

  function mudarEmail(email: string) {
    setUsuario((usuario) => ( {
      ...usuario,
      email: email,
    }));
  }

  function mudarSenha(senha: string) {
    setUsuario((usuario) => ({
      ...usuario,
      senha: senha,
    } ));
  }

  async function logar() {
    try {
      console.log(usuario);
      const { data } = await fazerLogin(
        usuario.email,
        usuario.senha
      );

      console.log(data);
      setMensagem(`o usuario ${data.nome} logou com sucesso`);
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
              onChange={(event) => mudarEmail(event.target.value)}
            />
            <input
              type="text"
              placeholder="senha"
              className="inputs"
              onChange={(event) => mudarSenha(event.target.value)}
            />
            <Button type="primary" className="botao" onClick={logar}>
              Logar
            </Button>
          </label>
          <Button type="primary" href={"/criar-usuario"} className="botao">
            Novo por aqui? crie sua conta
          </Button>
        </div>
      </div>
    </div>
  );
}
