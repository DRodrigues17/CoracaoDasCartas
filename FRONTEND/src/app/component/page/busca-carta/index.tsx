import React from 'react';

import ExibirCartas from '../exibir-cartas'
import './style.css'
import BotaoLinkagem from '../../botao-linkagem';

export default function BuscaCarta() {



    return (
        <div className=' tela-busca'>
            <div className='area-busca'>
                <input type="text" placeholder='nome da carta' />
                <BotaoLinkagem url='/carta' texto='Buscar'/>
            </div>
            <h1 className='titulo-tela'>Aqui estão algumas cartas de exemplo</h1>
            <ExibirCartas/>
        </div>
    )
}