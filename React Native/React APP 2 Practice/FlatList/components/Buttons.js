import React, { Component, PropTypes } from 'react'
import { Text, View, Button, Alert, StyleSheet, TouchableOpacity, Linking} from 'react-native'
const url="https://google.com"
export class Buttons extends Component {
    
    render() {
        return (
            <View style={StyleSheet.container}>
                <View style={StyleSheet.btn}>
                 <Button
          title="Press me"
          color="#f194ff"
          onPress={() => Alert.alert('Button with adjusted color pressed')}
        />
        
        </View>
        
        <View style = {styles.container}>
         <TouchableOpacity>
            <Text style = {styles.text}>
               <Text style={{color: 'blue'}} 
               onPress={() => Linking.openURL(url)}>Button</Text>
            </Text>
         </TouchableOpacity>
      </View>

        
            </View>
        )
    }
}



export default Buttons

const styles = StyleSheet.create ({
    container: {
       alignItems: 'center',
    },
    text: {
       borderWidth: 2,
       paddingLeft: 75,
       paddingTop:10,
       paddingBottom:10,
       width:200,
       borderColor: 'black',
       backgroundColor: 'red'
    }
 })
