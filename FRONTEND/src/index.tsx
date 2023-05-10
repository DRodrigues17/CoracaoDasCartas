import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import Home from './app/component/page/home';
import HistoriaJogo from './app/component/page/historia-jogo';
import ComoJogar from './app/component/page/como-jogar';
import TelaErro from './app/component/page/tela-erro';
import BuscaCarta from './app/component/page/busca-carta';
import TelaCarta from './app/component/page/tela-carta';


const router = createBrowserRouter([
  {
    path: "/", 
    element: <App />,
    errorElement: <TelaErro/>,
    children: [
      { path: "/", element: <Home /> },
      { path: "/historia-jogo", element: <HistoriaJogo /> },
      { path: "/como-jogar", element: <ComoJogar /> },
      { path: "/buscar-carta", element: <BuscaCarta /> },
      { path: "/carta", element: <TelaCarta /> }
    ]

  }

])

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <RouterProvider router={router} />
);
