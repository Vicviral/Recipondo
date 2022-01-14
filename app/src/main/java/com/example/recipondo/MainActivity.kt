package com.example.recipondo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Image(
                    painterResource(
                        R.drawable.pasta
                    ), "Banner Image",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )

                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Respondo Pasta",
                        style = TextStyle(
                            color = Color.DarkGray,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.W800,
                            letterSpacing = 0.1.em,
                        )
                    )

                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "Italian Dish",
                        style = TextStyle(
                            fontSize = 16.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "$7",
                        style = TextStyle(
                            color = Color(0xFF85bbc5),
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Italic,
                        )
                    )
                }
            }
        }
    }
}

