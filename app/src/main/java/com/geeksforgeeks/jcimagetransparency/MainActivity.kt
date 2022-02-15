package com.geeksforgeeks.jcimagetransparency

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent(){
    Scaffold(
        topBar = {TopAppBar(
            title = {Text(
                "GFG | Change Image Transparency",
                color = Color.White)},
            backgroundColor = Color(0xff0f9d58)
        ) },
        content = { MyContent()}
    )
}

@Composable
fun MyContent(){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.sample_image),
            contentDescription = null,
        )

        Spacer(modifier = Modifier.height(100.dp))

        Image(
            painter = painterResource(id = R.drawable.sample_image),
            contentDescription = null,
            alpha = 0.2F
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainContent()
}