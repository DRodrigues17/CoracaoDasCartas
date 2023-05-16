import axios from 'axios';
import { Conta } from '../interface/conta/Conta';

const baseUrl = axios.create({
    baseURL: 'http://localhost:8080/coracao-das-cartas/v1/contas'
})

export const criarConta = (conta: Conta) => {
    baseUrl.post(`/${conta}`)
}

export const fazerLogin = (email: String, senha: string) => {
    baseUrl.get(`/${email}/${senha}`)
}