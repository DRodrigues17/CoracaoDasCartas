import React from 'react';
import Navbar from './app/component/navbar';
import Footer from './app/component/footer';
import { Outlet } from 'react-router-dom';


function App() {
  return (
    <div className="App">
      <Navbar />
      <Outlet />
      <Footer />
    </div>
  );
}

export default App;