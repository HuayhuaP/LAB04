package com.example.nuevoproyecto4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.foundation.background
import androidx.compose.foundation.border

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nuevoproyecto4.ui.theme.NuevoProyecto4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NuevoProyecto4Theme{
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    LazyColumnExample()
                    LazyRowExample()
                    SurfaceExample()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun LazyColumnExample() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray) // Cambiar el fondo de la LazyColumn
            .padding(16.dp) // Agregar padding global a la LazyColumn
    ) {
        items(100) { index ->
            Text(
                text = "Item $index",
                color = Color.Blue, // Cambiar el color del texto
                fontSize = 20.sp, // Aumentar el tamaño del texto
                fontWeight = FontWeight.Bold, // Hacer el texto en negritas
                modifier = Modifier
                    .padding(8.dp)
                    .background(Color.White) // Fondo del texto
                    .border(1.dp, Color.Black) // Bordes alrededor del texto
                    .padding(8.dp) // Padding dentro del texto
            )
        }
    }
}



@Composable
fun LazyRowExample() {
    LazyRow {
        items(100) { index ->
            Text(text = "Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}
@Composable
fun SurfaceExample() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        color = Color.Cyan,
        contentColor = Color.Black,
        border = BorderStroke(2.dp, Color.DarkGray)
    ) {
        Text(
            text = "This is a Surface",
            modifier = Modifier.padding(24.dp),
            fontSize = 20.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NuevoProyecto4Theme {
        Greeting("Android")
    }
}

