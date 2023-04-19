import React from 'react';
import './style.css';
import Navbar from '../../navbar';
import Footer from '../../footer';
import Button from '../../button';

export default function Home(){
    return (
        <div className="App">
          <Navbar/>
          <div className='content-area'>
              <Button/>
              <Button/>
              <Button/>
          </div>
          <Footer/>
        </div>
      );
}