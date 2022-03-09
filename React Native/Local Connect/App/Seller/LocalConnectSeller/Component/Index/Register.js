import React from 'react'
import { View, Text, StyleSheet, Image, TouchableOpacity } from 'react-native'
import { ScrollView, TextInput } from 'react-native-gesture-handler'
import { widthPercentageToDP as wp, heightPercentageToDP as hp } from 'react-native-responsive-screen';

export default function Register(props) {
    return (
        <>
            <ScrollView>
                <View style={styles.ImageView}>
                    <Image style={styles.logopos} source={require('../../assets/logo2.png')} />
                </View>

                <View style={styles.headingView}>
                    <Text style={styles.HeadingText}>Register with us</Text>
                </View>

                <View style={styles.Form}>
                    <TouchableOpacity>
                        <TextInput placeholder="Enter Your Full Name" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity>
                        <TextInput placeholder="Business Name" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity>
                        <TextInput placeholder="Email" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity>
                        <TextInput placeholder="Phone Number" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity>
                        <TextInput placeholder="Password" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity>
                        <TextInput placeholder="Confirm Password" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity style={styles.butt} onPress={() => props.navigation.navigate("Login")}>
                        <Text style={styles.btn}>Sign In</Text>
                    </TouchableOpacity>
                </View>
            </ScrollView>

            {/* <ScrollView style={styles.backgroundContainer}>
                <Image style={styles.logopos} source={require('../../assets/logo2.png')} />
                <View >
                    <Text style={styles.HeadingText}>Register with us</Text>
                </View>
                <View style={styles.flexcolumn}>
                    <TouchableOpacity>
                        <TextInput placeholder="Enter Your Full Name" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity>
                        <TextInput placeholder="Business Name" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity>
                        <TextInput placeholder="Email" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity>
                        <TextInput placeholder="Phone Number" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity>
                        <TextInput placeholder="Password" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity>
                        <TextInput placeholder="Confirm Password" style={styles.labelMail}></TextInput>
                    </TouchableOpacity>
                    <TouchableOpacity style={styles.butt} onPress={() => props.navigation.navigate("Login")}>
                        <Text style={styles.btn}>Sign In</Text>
                    </TouchableOpacity>
                </View>
            </ScrollView> */}
        </>
    )
}

const styles = StyleSheet.create({
    // backgroundContainer: {
    //     backgroundColor: "#fff",
    //     marginVertical: hp(5)
    // },
    // logopos: {
    //     display: "flex",
    //     alignSelf: "center",
    //     marginTop: hp("0"),
    //     resizeMode: "contain",
    //     width: "80%",
    //     height: "15%",
    // },
    // Form: {
    //     display: "flex",
    //     flexDirection: "column",
    //     alignItems: "center",
    // },
    // HeadingText: {
    //     fontSize: 22,
    //     marginVertical: hp(4),
    //     textAlign: "center",
    //     fontWeight: "bold",
    //     color: "#871111",
    // },
    // labelMail: {
    //     display: "flex",
    //     flexDirection: "row",
    //     justifyContent: "space-between",
    //     alignItems: "center",
    //     width: wp("80"),
    //     borderColor: "#ccc",
    //     borderWidth: 1,
    //     backgroundColor: "#fff",
    //     color: "#808080",
    //     borderRadius: 10,
    //     marginVertical: hp(2),
    //     paddingRight: wp(1.5)
    // },
    // butt: {
    //     backgroundColor: "#d50021",
    //     color: "white",
    //     borderRadius: 10,
    //     width: wp("80"),
    //     marginVertical: hp(2.8),
    // },
    // btn: {
    //     paddingVertical: hp(1.5),
    //     textAlign: "center",
    //     color: "white",
    //     fontWeight: "bold",
    // }

    ImageView: {
        // width:"100%",
    },

    logopos: {
        resizeMode: "contain",
        width: "40%",
        marginLeft: "30%",
        height: 100,
        marginTop: "4%",
    },

    HeadingText: {
        fontSize: 22,
        marginVertical: hp(2),
        textAlign: "center",
        fontWeight: "bold",
        color: "#871111",
    },

    Form: {
        alignItems: "center",
    },

     labelMail: {
        width: wp("90"),
        borderColor: "#ccc",
        borderWidth: 0.5,
        backgroundColor: "#fff",
        color: "#808080",
        borderRadius: 5,
        marginVertical: hp(1),
        paddingLeft: wp(4)
    },

    butt: {
        backgroundColor: "#d50021",
        color: "white",
        borderRadius: 10,
        width: wp("80"),
        marginVertical: hp(2),
    },

    btn: {
        paddingVertical: hp(1.5),
        textAlign: "center",
        color: "white",
        fontWeight: "bold",
    }
})

