import axios from 'axios';

const baseUrl = axios.create({
    baseURL: 'http://localhost:8080/coracao-das-cartas/v1'
})

export const getCartas = baseUrl.get('/cartas')

export const getCartaPorNome =  (nome: String) => {
    baseUrl.get('/cartas/${nome}')
}