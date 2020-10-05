import React from 'react';
// import { ReactComponent as Logo } from '../../assets/logoAccenture.svg'
import './styles.css';

const Header = () => (
    <header className="main-header">
        {/* <Logo /> */}
        <div className="logo-text">
            <span className="logo-text-1">Accenture</span>
            <span className="logo-text-2">Challenge</span>
        </div>
    </header>
);

export default Header;