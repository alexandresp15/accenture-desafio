import React from 'react';
import { ReactComponent as Cell} from '../../assets/nokia.svg';
import './styles.css';

const Home = () => (
    <div>
        <div className="home-container">
            <div className="home-text">
                <h1 className="home-text-title">
                    Desafio do celular tijolão! 
                </h1> 
            </div>
            <Cell className="home-image" />
        </div>
    </div>
);

export default Home;