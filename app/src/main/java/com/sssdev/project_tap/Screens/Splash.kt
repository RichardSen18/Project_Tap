package com.sssdev.project_tap.screens

import com.sssdev.project_tap.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen()
{

    Splash()
}

@Composable
fun Splash()
{
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Image(painter = painterResource(id = R.drawable.upsrj_logo),
            contentDescription = "LOGO APP",
            modifier = Modifier
                .clip(CircleShape)
                .size(300.dp, 300.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview()
{
    Splash()
}
