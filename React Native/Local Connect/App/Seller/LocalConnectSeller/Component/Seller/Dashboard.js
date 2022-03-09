import React from 'react'
import { View, Text, StyleSheet, ScrollView, TouchableOpacity, Image } from 'react-native'
import Header, { HeaderComponent } from '../Index/HeaderComponent';
import { FontAwesomeIcon } from '@fortawesome/react-native-fontawesome';
import { faBriefcase, faAward, faTags } from '@fortawesome/free-solid-svg-icons'
import { widthPercentageToDP as wp, heightPercentageToDP as hp } from 'react-native-responsive-screen';

export default function Dashboard(props) {
    return (
        <>
            <HeaderComponent name="Dashboard" rootProps={props} />

            <ScrollView>

                {/* Seller Name */}
                <View style={styles.SellerNameView}>
                    <Text style={styles.SellerNameText}>Hello Bhanu</Text>
                </View>

                {/* Business Performance */}

                <View style={styles.PerformanceView}>

                    <TouchableOpacity style={styles.PerformanceCard}>
                        <View style={styles.PerformanceCardIcon}>
                            <FontAwesomeIcon icon={faBriefcase} size={60} style={styles.icons} />
                        </View>

                        <View style={styles.PerformanceCardReport}>
                            <Text style={styles.PerformanceCardReportText}>Business Listed</Text>
                        </View>
                    </TouchableOpacity>

                    <TouchableOpacity style={styles.PerformanceCard}>
                        <View style={styles.PerformanceCardIcon}>
                            <FontAwesomeIcon icon={faAward} size={60} style={styles.icons} />
                        </View>

                        <View style={styles.PerformanceCardReport}>
                            <Text style={styles.PerformanceCardReportText}>Total Redeem Offer</Text>
                        </View>
                    </TouchableOpacity>

                    <TouchableOpacity style={styles.PerformanceCard}>
                        <View style={styles.PerformanceCardIcon}>
                            <FontAwesomeIcon icon={faTags} size={60} style={styles.icons} />
                        </View>

                        <View style={styles.PerformanceCardReport}>
                            <Text style={styles.PerformanceCardReportText}>Running Ads</Text>
                        </View>
                    </TouchableOpacity>

                </View>

                {/* ****************************** */}

                {/* Buyer Overview */}
                <ScrollView
                    horizontal
                    showsHorizontalScrollIndicator={false}>
                    <View style={styles.OverviewView}>

                        <View style={styles.OverviewCard}>
                            <View style={styles.OverviewHead}>
                                <View style={styles.ReviwerPic} >
                                    <Image style={styles.profile} source={require('../../assets/faces-clipart/pic1.png')} />
                                </View>
                                <View style={styles.ReviwerName}>
                                    <Text style={styles.ReviwerNameText}>Bhanu Gudheniya</Text>
                                </View>
                            </View>

                            <View style={styles.OverviewBody}>
                                <Text style={styles.OverviewBodyText}>With supporting text below as a natural lead-in to additional content.</Text>
                            </View>
                        </View>

                        <View style={styles.OverviewCard}>
                            <View style={styles.OverviewHead}>
                                <View style={styles.ReviwerPic} >
                                    <Image style={styles.profile} source={require('../../assets/faces-clipart/pic1.png')} />
                                </View>
                                <View style={styles.ReviwerName}>
                                    <Text style={styles.ReviwerNameText}>Bhanu Gudheniya</Text>
                                </View>
                            </View>

                            <View style={styles.OverviewBody}>
                                <Text style={styles.OverviewBodyText}>With supporting text below as a natural lead-in to additional content.</Text>
                            </View>
                        </View>

                    </View>
                </ScrollView>

            </ScrollView>
        </>
    )
}

const styles = StyleSheet.create({
    SellerNameView: {
        backgroundColor: "#F1F1F1",
        padding: "2%",
        width: "92%",
        marginLeft: "4%",
        marginTop: "2%",
        borderRadius: 3,

        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 3,
        },
        shadowOpacity: 0.29,
        shadowRadius: 4.65,

        elevation: 7,
        marginBottom: "2%",
    },

    SellerNameText: {
        fontSize: 20,
        marginLeft: "1%",
        color: "#0A6BB6",
        fontWeight: "bold",
    },

    PerformanceView: {
        width: "100%",
        marginTop: "2%",
        marginBottom: "2%",
        padding: "1%",
    },

    PerformanceCard: {
        width: "96%",
        marginLeft: "2%",
        marginBottom: "2%",
        borderRadius: 5,

        flexDirection: "row",
        justifyContent: "space-evenly",
        justifyContent: "center",

        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 1,
        },
        shadowOpacity: 0.22,
        shadowRadius: 2.22,

        elevation: 3,
    },

    PerformanceCardIcon: {
        width: "30%",
        alignItems: "center",
        padding: "4%",
    },

    icons: {
        color: "#04C9B7",
    },

    PerformanceCardReport: {
        width: "64%",
    },

    PerformanceCardReportText: {
        width: "100%",
        fontSize: 22,
        textAlign: "center",
        textAlignVertical: "center",
        height: 100,

    },

    OverViewDiv: {
        justifyContent: "center",
        margin: 5,
    },

    OverviewView: {
        flexDirection: "row",
    },

    OverviewCard: {
        padding: "1%",
        backgroundColor: "#FAFAFA",
        width:wp(70),
        paddingBottom:10,
        margin:5,

        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 1,
        },
        shadowOpacity: 0.20,
        shadowRadius: 1.41,

        elevation: 2,
    },

    OverviewHead: {
        flexDirection: "row",
        backgroundColor: "#F1F1F1",
    },

    ReviwerPic: {
        width: "20%",
    },

    profile: {
        height: 45,
        width: 45,
    },

    ReviwerName: {
        width: "76%",
    },

    ReviwerNameText: {
        fontSize: 16,
        textAlign: "center",
        textAlignVertical: "center",
        height: 40,
    },

    OverviewBody: {
        margin: 1,
        marginTop: 5,
        paddingTop: "8%",
        // height:80,
    },

    OverviewBodyText: {
        fontSize: 15,
        textAlign: "center",
        color: "#505050",
    }
})