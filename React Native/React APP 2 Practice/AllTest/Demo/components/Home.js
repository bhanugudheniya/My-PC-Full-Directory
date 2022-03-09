import React, { Component } from 'react'
import { Text, View, ImageBackground } from 'react-native'

export class Home extends Component {
    render() {
        return (
            <ImageBackground source ={require('../android/app/src/Images/Koala.jpg')}  
            style={{width: '100%', height: '100%'}}/>  
        );
    }
}

export default Home
