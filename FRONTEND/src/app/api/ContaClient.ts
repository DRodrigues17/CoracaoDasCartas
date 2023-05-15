import axios from 'axios';
import { Conta } from '../interface/Conta';

const baseUrl = axios.create({
    baseURL: 'http://localhost:8080/coracao-das-cartas/v1/contas'
})
    ^

export const criarCOnta = (conta: Conta) => {
    axios.post(`http://localhost:8080/coracao-das-cartas/v1/contas/${conta}`)
}

export const fazerLogin = (email: String, senha: string) => {
    baseUrl.get(`/${email}/${senha}`)
}