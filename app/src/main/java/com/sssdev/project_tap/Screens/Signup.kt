import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.sssdev.project_tap.R

class SignupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegisterScreen()
        }
    }
}

@Composable
fun RegisterScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .background(Color(0xFF008573))
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .size(125.dp)
                    .padding(16.dp),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(120.dp))
        RegisterForm()
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterForm() {
    val username = remember { "" }
    val phone = remember { "" }
    val email = remember { "" }
    val password = remember { "" }
    val confirmPassword = remember { "" }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF97b6a7), shape = RoundedCornerShape(8.dp))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = username,
            onValueChange = { /* Handle change */ },
            label = { Text("Usuario") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = phone,
            onValueChange = { /* Handle change */ },
            label = { Text("Telefono") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = email,
            onValueChange = { /* Handle change */ },
            label = { Text("Correo electronico") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = password,
            onValueChange = { /* Handle change */ },
            label = { Text("Contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = confirmPassword,
            onValueChange = { /* Handle change */ },
            label = { Text("Confirmar Contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(60.dp))
        Button(
            onClick = { /* Handle click */ },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF008573),
                contentColor = Color.White
            )

        ) {
            Text("Registrarme", fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignupPreview() {
    RegisterScreen()
}
