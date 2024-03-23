import axios from 'axios';

const baseUrl = axios.create({
    baseURL: import.meta.env.VITE_BACKEND_BASE_URL
})

export const buscarCartas = baseUrl.get('/cartas')

export const buscarCartaPorNome = (nome: string) => {
    console.log("URL BASE DO BACKEND" + baseUrl);
    baseUrl.get(`/cartas/${nome}`)
}