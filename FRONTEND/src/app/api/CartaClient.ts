import axios from 'axios';

const baseUrl = axios.create({
    baseURL: 'http://localhost:8080/coracao-das-cartas/v1'
})

export const buscarCartas = baseUrl.get('/cartas')

export const buscarCartaPorNome = (nome: String) => {
    baseUrl.get(`/cartas/${nome}`)
}