import React, { Component } from 'react'
import { Text, View, StyleSheet, TextInput } from 'react-native'
import { TouchableOpacity } from 'react-native-gesture-handler';
import { FontAwesomeIcon } from '@fortawesome/react-native-fontawesome'
import { faBars, faSearch, faShoppingCart, faUserAlt, faBell } from '@fortawesome/free-solid-svg-icons'
import { DrawerActions } from '@react-navigation/native';

export class HeaderComponent extends Component {
    constructor(props) {
        super(props);
    }

    toggle = () => {
        this.props.rootProps.navigation.dispatch(DrawerActions.toggleDrawer())
    }

    render() {
        return (
            <>
                <View style={styles.container}>

                    <View style={styles.UpperLayer}>

                        <View style={styles.hamburgerIcon} >
                            <TouchableOpacity>
                                <FontAwesomeIcon icon={ faBars } size={30} style={styles.icons} onPress={()=>this.toggle()} />
                            </TouchableOpacity>
                        </View>

                        <View style={styles.LogoView}>
                            <Text style={styles.Logo}>Local Connect</Text>
                        </View>

                        {/* <View style={styles.LoginView}>
                            <TouchableOpacity  onPress={() => this.props.navigation.navigate("Help")}>
                                <FontAwesomeIcon icon={ faBell } size={22} style={styles.IconCart} />
                            </TouchableOpacity>
                        </View>
                        

                        <View style={styles.IconCartView}>
                            <TouchableOpacity onPress={() => this.props.navigation.navigate("Help")}>
                                <FontAwesomeIcon icon={ faShoppingCart } size={22} style={styles.IconCart} />
                            </TouchableOpacity>
                        </View> */}
                    
                    </View>

                    {/* <View style={styles.LowerLayer}>

                        <View style={styles.Icon0} >
                        <TouchableOpacity onPress={() => this.props.navigation.navigate("Help")}>
                            <FontAwesomeIcon icon={ faUserAlt } size={17} style={styles.iconProfile} />
                        </TouchableOpacity>
                        </View>

                            <View style={styles.searchDiv}>
                                <TextInput placeholder="Search..." style={styles.search}></TextInput>
                            </View>

                            <View style={styles.Icon}>
                                <FontAwesomeIcon icon={ faSearch } size={17} style={styles.iconSearch} />
                            </View>
                    </View> */}

                </View>
            </>
        )
    }
}

const styles = StyleSheet.create({
    container: {
        // flexDirection: "row",
        width: '100%',
        height: 50,
        backgroundColor: '#4D4D4D',
        shadowColor: "#000",

        shadowOffset: {
            width: 0,
            height: 0,
        },
        shadowOpacity: 0.23,
        shadowRadius: 2.62,

        // elevation: 4,
        fontFamily: 'Montserrat-Black',
        fontSize: 32
        //         shadowColor: "#000",
        // shadowOffset: {
        // 	width: 0,
        // 	height: 0,
        // },
        // shadowOpacity: 0.25,
        // shadowRadius: 3.84,

        // elevation: 5,
    },

    UpperLayer:{
        flexDirection:"row",
        height:50,
        // backgroundColor:"#D1F0A7",
    },

    icons: {
        width: 35,
        marginTop: 10 ,
        marginLeft: 4,
        // height: 40,
        color:"#fff"
    },
    lines: {
        borderColor: "#000",
        borderWidth: 2,
        width: "80%",
        marginLeft: "10%",
        marginVertical: 6
    },
    hamburgerIcon: {
        // flex: 1,
        marginLeft:"2%",
        width:"12%"
        // backgroundColor:'red'
    },

    LogoView:{
        // backgroundColor:"green",
        width:"42%",
        alignSelf:"center",
    },

    Logo:{
        fontSize:18,
        textAlign:"center",
        color:"#fff",
    },

    LoginView:{
        // backgroundColor:"green",
        alignSelf:"center",
        width:"10%",
        marginLeft:"18%",
        // borderWidth:1,
        // borderRadius:3,
        borderColor:"#fff",
    },

    Login:{
        fontSize:18,
        textAlign:"center",
        color:"#fff",
    },

    IconCartView:{
        // backgroundColor:"green",
        alignSelf:"center",
        width:"10%",
        marginLeft:"2%"
    },

    IconCart:{
        alignSelf:"center",
        color:"#8FC0CD"
    },
    
    // Layer Two

    searchDiv:{
        // borderWidth:1,
        width:"66%",
        marginLeft:"3%",
        marginRight:"3%",
    },

    search:{
        backgroundColor:"#fff",
        borderRadius:5,
        paddingTop:4,
        paddingBottom:6,
        marginTop:7,
        textAlign:"center",
        justifyContent:"center",
    },

    searchCon:{
        // flexDirection:"row",
        justifyContent:"center",
        marginLeft:"0%",
        width:"100%",
    },

    Icon:{
        marginRight:"3%",
        width:"18%",
        borderRadius:5,
        backgroundColor:"#fff",
        marginTop:7,
        // height:40,
        width:40,
    },

    iconSearch:{
        alignSelf:"center",
        marginTop:"28%",
        // paddingLeft:"5%",
        color:"#1b6296"
    },

    Icon0:{
        marginLeft:"3%",
        width:"18%",
        borderRadius:5,
        backgroundColor:"#fff",
        marginTop:7,
        // height:40,
        width:40,
    },

    iconProfile:{
        alignSelf:"center",
        marginTop:"28%",
        // paddingLeft:"5%",
        color:"#1b6296"
    },

    LowerLayer:{
        flexDirection:"row",
    }
});
export default HeaderComponent
