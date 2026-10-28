package com.prueba

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import cafe.adriel.voyager.navigator.Navigator

@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigator(screen = MainScreen())
    }
}

class MainScreen:Screen{

    @Composable
    override fun Content() {
        MaterialTheme {
            var name:String by remember { mutableStateOf("") }
            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(modifier = Modifier.height(38.dp))
                TextField(
                    value = name,
                    onValueChange = {name = it}

                )
                Spacer(modifier = Modifier.height(38.dp))
                AnimatedVisibility(name.isNotEmpty()){
                    Text("hola $name", fontSize = 50.sp)
                }
            }
        }
    }

}

