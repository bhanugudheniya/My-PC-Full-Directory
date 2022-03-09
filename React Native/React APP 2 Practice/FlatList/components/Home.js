import React, { Component } from 'react'
import { Text, View, FlatList, StyleSheet} from 'react-native'

const DATA =[
    {
        id : 'bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
        title : 'Bhanu Gudheniya',
    },
    {
        id : '3ac68afc-c605-48d3-a4f8-fbd91aa97f63',
        title : 'Hello Universe',
    },
    {
        id : '58694a0f-3da1-471f-bd96-145571e29d72',
        title : "Hello World",
    },
];


function Item({title}) {
    return (
        <View>
            <Text>{title}</Text>
        </View>
    );
}

export class Home extends Component {
    render() {
        return (
            <FlatList
                data={DATA}
                renderItem={({item}) => <Item title={item.title} />}
                keyExtractor={item => item.id}
                />
        )
    }
}



export default Home
