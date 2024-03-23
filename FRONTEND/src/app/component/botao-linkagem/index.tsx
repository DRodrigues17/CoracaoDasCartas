import { Link } from "react-router-dom";
import "./style.css";

export default function BotaoLinkagem(props: any) {
  return (
    <Link to={props.url} className="botao">
      {props.texto}
    </Link>
  );
}
