import axios from 'axios';
import { Usuario } from '../interface/usuario/Usuario.ts';

const baseUrl = axios.create({
    baseURL: import.meta.env.VITE_BACKEND_BASE_URL + '/usuarios'
})

export const criarConta = async (conta: Usuario) => {
    console.log("URL BASE DO BACKEND" + baseUrl);
    
    return baseUrl.post( "/cadastro", conta)
}

export const fazerLogin = async (email: string, senha: string) => {
    return baseUrl.get(`/login/${email}/${senha}`)
}