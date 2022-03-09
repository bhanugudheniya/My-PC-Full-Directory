import React, { Component } from 'react'
import { Text, View } from 'react-native'
import { WebView } from 'react-native-webview';

export class Home extends Component {
    render() {
        return (
           <View>
               <WebView source={{ uri: 'https://facebook.github.io/react-native/' }} />
      </View>
        )
    }
}

export default Home
