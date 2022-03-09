/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */
import 'react-native-gesture-handler';
import React from 'react';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  StatusBar,
} from 'react-native';

import {createDrawerNavigator,  DrawerContentScrollView, DrawerItem,} from '@react-navigation/drawer';
import {createStackNavigator} from '@react-navigation/stack';
import {NavigationContainer, DefaultTheme, DarkTheme} from '@react-navigation/native';

import {
  Header,
  LearnMoreLinks,
  Colors,
  DebugInstructions,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';

import Splashscreen from './Component/Index/Splashscreen';
import Login from './Component/Index/Login';
import HeaderComponent from './Component/Index/HeaderComponent';
import Forgetpassword from './Component/Index/Forgetpassword';
import Register from './Component/Index/Register';

import Dashboard from './Component/Seller/Dashboard';
// import { faUserNurse } from '@fortawesome/free-solid-svg-icons';


const Drawer = createDrawerNavigator();
const Stack = createStackNavigator();
const MyTheme = {
  dark: false,
  colors: {
    primary: '#fff',
    background: 'rgb(242, 242, 242)',
    card: '#1b6296',
    text: '#fff',
    // border: 'rgb(199, 199, 204)',
  },
};

function sellerDashboardDrawer(){
  return(
    <Stack.Navigator initialRouteName="Dashboard" headerMode="none">
      <Stack.Screen name="Dashboard" component={Dashboard} />
    </Stack.Navigator>
  )
}

function DashboardDrawer(){
  return(
    <Drawer.Navigator initialRouteName="Dashboard">
      <Drawer.Screen name="Dashboard" component={sellerDashboardDrawer} />
    </Drawer.Navigator>
  )
}

const App: () => React$Node = () => {
  return (
    <>
      <NavigationContainer theme={MyTheme}>
        <Stack.Navigator initialRouteName="Splashscreen" headerMode="none">
          <Stack.Screen name="Splashscreen" component={Splashscreen} />
          <Stack.Screen name="Dashboard" component={DashboardDrawer} />
          <Stack.Screen name="Login" component={Login} />
          <Stack.Screen name="Register" component={Register} />
          <Stack.Screen name="Forgetpassword" component={Forgetpassword} />
        </Stack.Navigator>
      </NavigationContainer>
    </>
  );
};

const styles = StyleSheet.create({
 
});

export default App;
