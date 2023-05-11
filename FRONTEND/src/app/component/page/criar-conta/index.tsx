import React from "react";

import './style.css';
import BotaoLinkagem from "../../botao-linkagem";

export default function CriarConta() {
    return(
        <div className="content-area">
            <h1>Informe seus dados para Criar a sua Conta</h1>
            <label>
                <input type="text" placeholder="nome" />
                <input type="text" placeholder="email" />
                <input type="text" placeholder="senha" />
                <BotaoLinkagem texto="criar a conta" />
            </label>
        </div>
    )    
}