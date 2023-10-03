package com.den.gorobets.findyoumovie

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.den.gorobets.findyoumovie.ui.DiscoveryScreen

@Composable
fun App() {
    Navigator(DiscoveryScreen())
}