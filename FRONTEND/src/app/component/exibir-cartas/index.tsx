import React, { useState, useEffect } from 'react';

import { buscarCartas } from '../../api/CartaClient';
import { Carta } from '../../interface/Carta';

import './style.css'

export default function ExibirCartas() {


    const [cartas, setCartas] = useState<Array<Carta>>([]);

    useEffect(() => {
        buscarCartas.then(response => {
            console.log(response.data)
            setCartas(response.data.content)
        })
            .catch(error => {
                console.log(error)
            })

    }, [])

    console.log(buscarCartas)

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