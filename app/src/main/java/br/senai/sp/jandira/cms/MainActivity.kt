package br.senai.sp.jandira.cms

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.cms.ui.theme.CMSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CMSTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {


                }
            }
        }
    }
}

@Composable
fun Register(modifier: Modifier = Modifier) {

    var emailstate = remember {
        mutableStateOf("")
    }
    var senhastate = remember {
        mutableStateOf("")
    }

    var nomeState = remember {
        mutableStateOf("")
    }
    var sobrenomeState = remember {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier
        .fillMaxSize()) {
        Column(modifier = Modifier.padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.Center) {

            Text(text = "CMS Cadastro",
                color = Color(0xFF3F51B5),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold)



            OutlinedTextField(
                value = nomeState.value,
                onValueChange = {
                    nomeState.value = it
                },
                label = {
                    Row {
                        Icon(imageVector = Icons.Default.Person, contentDescription = "",
                            tint = Color(0xFF505050),
                            modifier = Modifier
                                .size(20.dp))
                        Spacer(modifier = modifier.width(4.dp))
                        Text(
                            text = "Nome",
                            color = Color.Black
                        )
                    }
                },
                shape = RoundedCornerShape(16.dp)
            )

            OutlinedTextField(
                value = sobrenomeState.value,
                onValueChange = {
                    sobrenomeState.value = it
                },
                label = {
                    Row {
                        Icon(imageVector = Icons.Default.Person, contentDescription = "",
                            tint = Color(0xFF505050),
                            modifier = Modifier
                                .size(20.dp))
                        Spacer(modifier = modifier.width(4.dp))
                        Text(
                            text = "Sobrenome",
                            color = Color.Black
                        )
                    }
                },
                shape = RoundedCornerShape(16.dp)
            )

            OutlinedTextField(
                value = emailstate.value,
                onValueChange = {senhastate.value = it},
                label = {
                    Row {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "",
                            tint = Color(0xFF505050),
                            modifier = Modifier
                                .size(20.dp))
                        Spacer(modifier = modifier.width(4.dp))
                        Text(
                            text = "Insira seu email",
                            color = Color.Black
                        )
                    }
                },
                shape = RoundedCornerShape(16.dp)
            )

            OutlinedTextField(
                value = senhastate.value,
                onValueChange = {
                    senhastate.value = it
                },
                label = {
                    Row {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = "",
                            tint = Color(0xFF505050),
                            modifier = Modifier
                                .size(20.dp))
                        Spacer(modifier = modifier.width(4.dp))
                        Text(
                            text = "Insira sua senha",
                            color = Color.Black
                        )
                    }
                },
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp)
            ) {
                Row(

                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = "Cadastrar",
                    )
                }
            }

        }
    }

}

@Preview (showSystemUi = true, showBackground = true)
@Composable
private fun RegisterPreview() {
    Register()
}