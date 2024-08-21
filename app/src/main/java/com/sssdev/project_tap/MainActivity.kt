package com.sssdev.project_tap

import LoginActivity
import SignupActivity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sssdev.project_tap.ui.theme.Project_TapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_TapTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    /*ESTE BOTON SOLO FUE DE PRUEBA, PUEDES BORRARLO CUANDO QUIERAS*/
    Button(
        onClick = {
            val intent = Intent(context, LoginActivity::class.java)
            context.startActivity(intent)
        },
        modifier = Modifier.width(200.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Black
        )

    ) {
        Text("Registrarme", fontSize = 18.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Project_TapTheme {
        Greeting("Android")
    }
}