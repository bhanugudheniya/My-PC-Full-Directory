import React, { Component } from 'react'
import { Text, View, StyleSheet, TouchableOpacity, ScrollView } from 'react-native'

export class Home extends Component {
    constructor(props) {
        super(props)
      
        this.state = {
           
        }
      }
      
    render() {
        return (
            <>
                <View style={{ flexDirection: 'row'}}>
                <ScrollView style={{ display: 'flex', flexDirection: 'column' }}>

                    <TouchableOpacity style={styles.Card} onPress={()=>this.props.navigation.navigate('Home')}>
                        <View style={styles.iconTextAlign}>
                            <Text style={styles.textStyles}>Home</Text>
                        </View>
                    </TouchableOpacity>

                    <TouchableOpacity style={styles.Card} onPress={()=>this.props.navigation.navigate('Home')}>
                        <View style={styles.iconTextAlign}>
                            <Text style={styles.textStyles}>Home</Text>
                        </View>
                    </TouchableOpacity>

                    <TouchableOpacity style={styles.Card} onPress={()=>this.props.navigation.navigate('Home')}>
                        <View style={styles.iconTextAlign}>
                            <Text style={styles.textStyles}>Home</Text>
                        </View>
                    </TouchableOpacity>

                </ScrollView>
                </View>
            </>
        )
    }
}

const styles = StyleSheet.create({
    Card: {
      display: 'flex',
      flexDirection: 'column',
      width: '33.33%',
      justifyContent: 'center',
      alignItems: 'center',
      marginTop: 35,
      shadowColor: "red",
    },

    textStyles: {
        textAlign: "center",
        paddingTop: 10
      },

      iconTextAlign:{
        display:'flex',flexDirection:'column',alignItems:'center',justifyContent:'center'
      }
    });

export default Home
