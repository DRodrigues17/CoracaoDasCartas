import { Outlet } from "react-router-dom";
import Footer from "./app/component/footer";
import Navbar from "./app/component/navbar";

function App() {
    return (
        <div className="App">
            <Navbar/>
            <Outlet/>
            <Footer/>
        </div>
    );
}

export default App;
