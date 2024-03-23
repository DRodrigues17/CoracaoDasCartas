import axios from 'axios';
import { Conta } from '../interface/conta/Conta';

const baseUrl = axios.create({
    baseURL: import.meta.env.VITE_BACKEND_BASE_URL + '/contas'
})

export const criarConta = async (conta: Conta) => {
    console.log("URL BASE DO BACKEND" + baseUrl);
    
    return baseUrl.post( "/cadastro", conta)
}

export const fazerLogin = async (email: string, senha: string) => {
    return baseUrl.get(`/login/${email}/${senha}`)
}