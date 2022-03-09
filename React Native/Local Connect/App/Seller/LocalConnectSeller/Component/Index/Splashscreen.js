import React, { Component } from 'react'
import { Text, View, StyleSheet,Image } from 'react-native'

export class Splashscreen extends Component {
    componentDidMount() {
        setTimeout(() => {
            this.props.navigation.navigate('Login')
        }, 3000);
    }


    render() {
        return (
            <View style={styles.backgroundColor}>

                <Image source={require('../../assets/logo2.png')} style={styles.logoStyle} />
               
            </View>
        )
    }
}

const styles = StyleSheet.create({
    logoStyle: {
        display: "flex",
        alignSelf: "center",
        marginTop: "auto",
        marginBottom: "auto",
        resizeMode :"contain",
        width: "40%",
    },
    backgroundColor: {
        backgroundColor: "#fff",
        height: "100%",
        display: "flex",
        justifyContent:"space-around",
    },
    image: {
        flex: 1,
        resizeMode: "cover",
        justifyContent: "center"
    },
})

export default Splashscreen
