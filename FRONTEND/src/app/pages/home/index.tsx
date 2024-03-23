import { Button } from "antd";
import "./style.css";

export default function Home() {
  return (
    <div className="content-area home">
      <Button type="primary" href={"/historia-jogo"} className="botao">
        História do Jogo
      </Button>
      <Button type="primary" href="/como-jogar" className="botao">
        Como Jogar
      </Button>
      <Button type="primary" href="/buscar-carta" className="botao">
        Busque por uma carta
      </Button>
    </div>
  );
}
