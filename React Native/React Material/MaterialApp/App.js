/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  StatusBar,
} from 'react-native';

import {
  Header,
  LearnMoreLinks,
  Colors,
  DebugInstructions,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';

import {
  NavigationContainer,
  DefaultTheme,
  DarkTheme,
} from '@react-navigation/native';

// import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'; //npm i @react-navigation/bottom-tabs
import {createDrawerNavigator} from '@react-navigation/drawer'; //npm i @react-navigation/drawer
import {createStackNavigator} from '@react-navigation/stack'; //npm i @react-navigation/stack
import 'react-native-gesture-handler'; //npm i react-native-gesture-handler
//npm i @react-navigation/native

const Drawer = createDrawerNavigator();
const Stack = createStackNavigator();
// const Tab = createBottomTabNavigator();

import Home from './Components/Home'
import SplashScreen from './Components/SplashScreen'
import Webview from './Components/Webview'
///////////////
function userHomeDrawer() {
  return (
    
    <Stack.Navigator initialRouteName="Home" headerMode="none">
      <Stack.Screen name="Home" component={Home}  />
      <Stack.Screen name="Webview" component={Webview} />
    </Stack.Navigator>
  );
}
//////////////
//////////////
function HomeDrawer() {
  return (
    <Drawer.Navigator initialRouteName="Dashboard">
      <Drawer.Screen name="Home" component={userHomeDrawer} />
      <Drawer.Screen name="Webview" component={Webview} />
    </Drawer.Navigator>
  );
} 
///////////////

const App: () => React$Node = () => {
  return (
    <>
      <NavigationContainer>
        <Stack.Navigator initialRouteName="SplashScreen" headerMode="none">
          <Stack.Screen name="Home" component={HomeDrawer} />
          {/* <Stack.Screen name="Notice" component={Notice} /> */}
        </Stack.Navigator>
      </NavigationContainer>
    </>
  );
};

const styles = StyleSheet.create({
  
});

export default App;
