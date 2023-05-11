import React, { useState, useEffect } from 'react';

import { getCartas } from '../../../api/CartaClient';
import { Carta } from '../../../interface/Carta';

import './style.css'

export default function ExibirCartas() {


    const [cartas, setCartas] = useState<Array<Carta>>([]);

    useEffect(() => {
        getCartas.then(response => {
            console.log(response.data)
            setCartas(response.data.content)
        })
    }, [])



    console.log(getCartas)

    return (
        <ul className='telas-conteudo-estatico area-cartas'>
            {cartas.map(carta => {
                return (
                    <li key={carta.nome} className='card-carta-exemplo'>
                        <p>Nome: {carta.nome}</p>
                        <p>Tipo: {carta.tipo}</p>
                    </li>
                )
            })}
        </ul>
    )
}