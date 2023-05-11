import React from "react";

import './style.css';
import BotaoLinkagem from "../../botao-linkagem";

export default function TelaLogin() {
    return (
        <div className="content-area">
            <h1>Informe seus dados para efeturar o login</h1>
            <label>
                <input type="text" placeholder="email" />
                <input type="text" placeholder="senha" />
                <BotaoLinkagem texto="efeturar login" />
            </label>
        </div>
    )
}