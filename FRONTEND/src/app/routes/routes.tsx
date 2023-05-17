import React from "react";

import { createBrowserRouter } from "react-router-dom";
import App from '../../App';
import Home from '../../app/pages/home';
import HistoriaJogo from '../../app/pages/historia-jogo';
import ComoJogar from '../../app/pages/como-jogar';
import TelaErro from '../../app/pages/tela-erro';
import BuscaCarta from '../../app/pages/busca-carta';
import TelaCarta from '../../app/pages/tela-carta';
import CriarConta from '../../app/pages/criar-conta';
import TelaLogin from '../../app/pages/login';




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
            { path: "/criar-conta", element: <CriarConta /> },
            { path: "/login", element: <TelaLogin /> }
        ]

    }

])