package com.example.teamtitans

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.teamtitans.ui.theme.TeamTitansTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.material3.HorizontalDivider
import androidx.compose.foundation.background
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TeamTitansTheme {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                        .statusBarsPadding()
                ) {

                    Text(
                        text = "TEAM TITANS",
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(top = 16.dp)
                    )

                    Jugador(
                        nombre = "AlexPro",
                        rol = "Atacante",
                        edad = 21,
                        nivel = 87,
                        imagen = R.drawable.jugador1
                    )
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 8.dp),
                        thickness = 2.dp,
                        color = MaterialTheme.colorScheme.primary
                    )

                    Jugador(
                        nombre = "ShadowX",
                        rol = "Defensor",
                        edad = 24,
                        nivel = 91,
                        imagen = R.drawable.jugador2
                    )
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 8.dp),
                        thickness = 2.dp,
                        color = MaterialTheme.colorScheme.primary
                    )

                    Jugador(
                        nombre = "MartaGG",
                        rol = "Soporte",
                        edad = 20,
                        nivel = 84,
                        imagen = R.drawable.jugador3
                    )
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 8.dp),
                        thickness = 2.dp,
                        color = MaterialTheme.colorScheme.primary
                    )

                    Jugador(
                        nombre = "Destroyer",
                        rol = "Atacante",
                        edad = 23,
                        nivel = 89,
                        imagen = R.drawable.jugador4
                    )
                }
            }
        }
    }
}

@Composable
fun Jugador(
    nombre: String,
    rol: String,
    edad: Int,
    nivel: Int,
    imagen: Int
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(12.dp)
    ) {
        Image(
            painter = painterResource(id = imagen),
            contentDescription = nombre,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
        )

        Column(
            modifier = Modifier.padding(start = 12.dp)
        ) {
            Text(
                text = nombre,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )

            Text(text = rol)
            Text(text = "$edad años")
            Text(text = "Nivel: $nivel")
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

@Preview(showBackground = true)
@Composable
fun JugadorPreview() {
    TeamTitansTheme {
        Jugador(
            nombre = "AlexPro",
            rol = "Atacante",
            edad = 21,
            nivel = 87,
            imagen = R.drawable.jugador1
        )
    }
}