import logo from './logo.svg';
import React, {Component} from 'react';
import './App.css';
import {getAllStudents} from './client';

//import { render } from '@testing-library/react';

class App extends Component {
    render() {

        getAllStudents().then(res => res.json().then(students => {
            console.log(students);
        }))
        return <h1>Hello wordl</h1>

    }
}

// <div className="App">
//   <header className="App-header">
//     <img src={logo} className="App-logo" alt="logo" />
//     <p>
//       Edit <code>src/App.js</code> and save to reload.
//     </p>
//     <a
//       className="App-link"
//       href="https://reactjs.org"
//       target="_blank"
//       rel="noopener noreferrer"
//     >
//       Learn React
//     </a>
//   </header>
// </div>


export default App;
