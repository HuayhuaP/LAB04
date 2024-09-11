package com.example.nuevoproyecto4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    LazyColumn {
        items(100) { index ->
            Text(text = "Item $index", modifier = Modifier.padding(8.dp))
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


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NuevoProyecto4Theme {
        Greeting("Android")
    }
}

@Composable
fun SurfaceExample() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Blue,
        contentColor = Color.White
    ) {
        Text("This is a Surface", modifier = Modifier.padding(16.dp))
    }
}



fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Hello, Student!",
            fontSize = 20.sp
        )
    }
}
