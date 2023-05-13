import React from 'react';
import yamiyugi from '../../../assets/img/YamiYugi.svg';

import './style.css'

export default function TelaCarta(pops: any) {

    return (
        <div className='content-area'>
            <h1 className='titulo-tela'> nome da carta</h1>
            <div className='area-carta'>
                <img src={yamiyugi} alt="" className='imagem-carta' />
                <div className='informacoes-carta'>
                    <h1>nome</h1>
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
