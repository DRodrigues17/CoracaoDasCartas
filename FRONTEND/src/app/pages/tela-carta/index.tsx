import React, { useEffect, useState, useContext } from 'react';
import yamiyugi from '../../../assets/img/YamiYugi.svg';

import './style.css'
import AdicionarFavorito from "../../../assets/img/favoritar.svg";

import { Carta } from '../../interface/carta/Carta';
import { buscarCartaPorNome } from '../../api/CartaClient';
import { Link, useParams } from 'react-router-dom';

export default function TelaCarta(props: any) {



    const [cartas, setCartas] = useState<Carta>();



    return (
        <div className='content-area'>
            <h1 className='titulo-tela'> nome da carta{props.nome}</h1>

            <div className='area-carta'>
                <img src={yamiyugi} alt="" className='imagem-carta' />
                <Link to={"/criar-conta"}>
                    <img src={AdicionarFavorito} alt="" />
                </Link>
                <div className='informacoes-carta'>
                    <h1>nome {props.nome}</h1>
                    <h1>tipo</h1>
                    <h1>desicrição</h1>
                    <h1>atk</h1>
                    <h1>def</h1>
                    <h1>raça</h1>
                    <h1>atributo</h1>
                    <h1></h1>
                    <h1></h1>

                </div>
            </div>

        </div>
    )
}
