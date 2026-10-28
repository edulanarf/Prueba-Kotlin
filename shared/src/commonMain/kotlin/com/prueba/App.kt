package com.prueba

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource

import prueba.shared.generated.resources.Res
import prueba.shared.generated.resources.compose_multiplatform
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import cafe.adriel.voyager.transitions.SlideTransition

@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigator(screen = MainScreen()){
            navigator ->
            SlideTransition(navigator)
        }
    }
}

class MainScreen:Screen{

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow //Si no encuentra, PARA -> "OrThrow" se puede quitar, otra opcion es comprobar con un if

        Column(modifier = Modifier.fillMaxWidth().padding(50.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {navigator.push(Welcome())}){
                Text("Navegación básica")
            }
        }
    }

}

