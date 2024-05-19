import ReactDOM from "react-dom/client";
import "./index.css";

import {RouterProvider} from "react-router-dom";
import {router} from "./app/routes/routes";
import ContaProvider from "./contexts/UsuarioContext.tsx";

const root = ReactDOM.createRoot(
    document.getElementById("root") as HTMLElement
);
root.render(
    <ContaProvider>
        <RouterProvider router={router}/>
    </ContaProvider>
)
;
