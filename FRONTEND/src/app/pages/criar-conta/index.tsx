import {useContext, useState} from "react";

import {Button} from "antd";
import exodia from "../../../assets/img/exodia.svg";
import {criarConta} from "../../api/UsuarioClient.ts";
import "./style.css";
import {UsuarioContext} from "../../../contexts/UsuarioContext.tsx";
import {Usuario} from "../../interface/usuario/Usuario.ts";

export default function CriarConta() {
    const {usuario, setUsuario} = useContext(UsuarioContext);

    const [mensagem, setMensagem] = useState("");

    function mudarNome(nome: string) {
        setUsuario((usuario) => usuario ? {
            ...usuario,
            nome: nome,
        } : undefined)
    }

    function mudarEmail(email: string) {
        setUsuario((usuario) => usuario ? {
            ...usuario,
            email: email,
        } : undefined)
    }

    function mudarSenha(senha: string) {
        setUsuario((usuario) => usuario ? {
            ...usuario,
            senha: senha,
        } : undefined)
    }



    async function criar() {
        try {
            console.log(usuario);

            const {data} = await criarConta((usuario as Usuario));

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
                <img src={exodia} alt="" className="imagens-tela"/>
                <p>{mensagem}</p>
                <div className="caixa-interativa">
                    <label className="area-inputs">
                        <input
                            type="text"
                            placeholder="nome"
                            className="inputs"
                            onChange={(event) => mudarNome(event.target.value)}
                        />
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
