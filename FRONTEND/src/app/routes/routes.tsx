import { createBrowserRouter } from "react-router-dom";
import App from "../../App";
import BuscaCarta from "../../app/pages/busca-carta";
import ComoJogar from "../../app/pages/como-jogar";
import CriarConta from "../../app/pages/criar-conta";
import HistoriaJogo from "../../app/pages/historia-jogo";
import Home from "../../app/pages/home";
import TelaLogin from "../../app/pages/login";
import TelaCarta from "../../app/pages/tela-carta";
import TelaErro from "../../app/pages/tela-erro";

export const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,
    errorElement: <TelaErro />,
    children: [
      { path: "/", element: <Home /> },
      { path: "/historia-jogo", element: <HistoriaJogo /> },
      { path: "/como-jogar", element: <ComoJogar /> },
      { path: "/buscar-carta", element: <BuscaCarta /> },
      { path: "/carta", element: <TelaCarta /> },
      { path: "/criar-usuario", element: <CriarConta /> },
      { path: "/login", element: <TelaLogin /> },
    ],
  },
]);
