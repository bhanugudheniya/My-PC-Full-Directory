/**
 * @format
 */

 import React, {Component} from 'react'
import {AppRegistry} from 'react-native';
import App from './App';
// import {name as appName} from './app.json';
import Home from './components/Home'
import Splash from './components/Splash'

class Main extends Component{
    constructor(props){
        super(props);
    this.state = {currentScreen : 'Splash'};
console.log('Start doing some takes for about 3 seconds')
setTimeout(()=>{
    console.log('Done some tasks for about 3 seconds')
}, 3000)
}


render(){
    const {currentScreen} = this.state
    let mainScreen = currentScreen === 'Splash' ? <Splash /> : <Home />
    return mainScreen
}
}
AppRegistry.registerComponent('splashscreen', () => Main);
