import React, { useState } from "react";

import { Button } from "antd";
import ExibirCartas from "../../component/exibir-cartas";
import "./style.css";

export default function BuscaCarta() {
  const [nome, setNome] = useState("");

  function salvarNomeNoEstadoGlobal():
    | React.MouseEventHandler<HTMLButtonElement>
    | undefined {
    throw new Error("Function not implemented.");
  }

  return (
    <div className=" tela-busca">
      <div className="area-busca">
        <input
          type="text"
          placeholder="nome da carta"
          value={nome}
          onChange={(e) => setNome(e.target.value)}
        />
        <Button type="primary" href={"/carta"} className="botao">
          {" "}
          Buscar
        </Button>
      </div>
      <h1 className="titulo-tela">Aqui estão algumas cartas de exemplo</h1>
      <ExibirCartas />
    </div>
  );
}
