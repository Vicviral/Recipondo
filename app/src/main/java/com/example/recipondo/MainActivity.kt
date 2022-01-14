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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Image(painterResource(
                    R.drawable.pasta), "Banner Image",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )
                
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Respondo Pasta")
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "600 Calories")
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "Italian Dish")
                }
            }
        }
    }
}

