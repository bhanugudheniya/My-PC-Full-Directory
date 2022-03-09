import React, { Component } from 'react'
import { Text, View } from 'react-native'

export class Splash extends Component {
    constructor(props){
        super(props)
        this.state = { timer : 0}
        setInterval(()=>{
            this.setState({timer:this.state.timer +1})
        }, 1000)
    }
    render() {
        return (
            <View>
                <Text > {`Welcome To My App : ${this.state.timer}`} </Text>
        {/* <Text>{`Hello Splash`}</Text> */}
            </View>
        )
    }
}

// const styles = StyleSheet.create({
//     container:{
//         backgroundColor : 'rgb(32, 53, 70)',
//         flex:1,
//         alignItems:'center',
//         justifyContent:'center',
//     },
//     title:{
//         fontWeight:'bold',
//         fontSize:28,
//         color:'white',
//     }
// });

export default Splash
