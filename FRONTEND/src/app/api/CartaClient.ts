import axios from 'axios';
import { useState, useEffect } from 'react';

export const buscarCartas = async () => {
const [cartas , setCartas] = useState([])

useEffect(() => {
    axios.get('localhost:8080/coracao-das-cartas/v1/cartas')
    .then(response => {
     setCartas(response.data)
    })
})
    return cartas
}

export const buscarCartaPorNome = (nome : String) => {
    return axios.get(
        'localhost:8080/coracao-das-cartas/v1/cartas/${nome}'
    ).then(response => {
     response.data
    })
}