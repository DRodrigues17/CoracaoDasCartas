import {
    Dispatch,
    ReactNode,
    SetStateAction,
    createContext,
    useState,
} from "react";
import { Usuario } from "../app/interface/usuario/Usuario.ts";

interface UsuarioProviderProps {
  children: ReactNode;
}

export interface ContaContextData {
  usuario?: Usuario;
  setUsuario: Dispatch<SetStateAction<Usuario | undefined>>;
  token: string;
  setToken: Dispatch<SetStateAction<string>>;
  estaLogado: boolean;
  setEstaLogado: Dispatch<SetStateAction<boolean>>;
}

export const UsuarioContext = createContext({} as ContaContextData);

export default function ContaProvider({ children }: UsuarioProviderProps) {
  const [usuario, setUsuario] = useState<Usuario | undefined>();
  const [token, setToken] = useState<string>("");
  const [estaLogado, setEstaLogado] = useState<boolean>(false);

  return (
    <UsuarioContext.Provider
      value={{ usuario, setUsuario, token, setToken, estaLogado, setEstaLogado }}
    >
      {children}
    </UsuarioContext.Provider>
  );
}
