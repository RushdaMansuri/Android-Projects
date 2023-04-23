package com.example.businesscard

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.MaterialTheme
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

import android.os.Bundle

import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme(darkTheme = true) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardWithImage(name = "Rushda Mansuri", title = "Software Engineer", phone = "+1 (848) 309 4128", email = "rm47512n@pace.edu", handle = "@RushdaMansuri")
                }
            }
        }
    }
}

@Composable
fun BusinessCardWithImage(name: String, title: String, phone: String, email: String, handle: String, modifier: Modifier = Modifier) {
    val darkGreen = Color(0xFF0A412B)
    val subtitleColor = Color(0xFFA247DB)
    val image = painterResource(id = R.drawable.android_logo)
    val callIcon = painterResource(id = R.drawable.call_icon)
    val emailIcon = painterResource(id = R.drawable.email_icon)
    val laptopIcon = painterResource(id = R.drawable.laptop_icon)
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = darkGreen) {
        Box(contentAlignment = Alignment.TopCenter) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row(modifier = Modifier.padding(top = 100.dp)) {
                    Box(modifier = Modifier.height(150.dp)) {
                        Image(
                            modifier = Modifier,
                            painter = image,
                            contentDescription = null,
                            contentScale = ContentScale.Inside
                        )
                    }
                }
                Row(modifier = Modifier.padding(top = 10.dp)) {
                    Text(
                        text = name,
                        fontSize = 44.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White,
                        modifier = modifier
                    )
                }
                Row(modifier = Modifier.padding(top = 5.dp)) {
                    Text(
                        text = title,
                        fontSize = 25.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = subtitleColor,
                        modifier = modifier
                    )
                }
            }
        }
        Box(contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.Start) {
                Row(modifier = Modifier.padding(top = 250.dp)) {
                    Divider(color = Color.Gray, thickness = 1.dp)
                }
                Row(modifier = Modifier.padding(top = 15.dp)) {
                    Box(modifier = Modifier.padding(start = 40.dp))
                    Image(
                        modifier = Modifier.padding(horizontal = 30.dp),
                        painter = callIcon,
                        contentDescription = null
                    )
                    Text(
                        text = phone,
                        color = Color.White,
                        fontSize = 20.sp,
                        modifier = modifier
                    )
                }
                Row(modifier = Modifier.padding(top = 20.dp)) {
                    Divider(color = Color.Gray, thickness = 1.dp)
                }
                Row(modifier = Modifier.padding(top = 20.dp)) {
                    Box(modifier = Modifier.padding(start = 40.dp))
                    Image(
                        modifier = Modifier.padding(horizontal = 30.dp),
                        painter = laptopIcon,
                        contentDescription = null,
                        contentScale = ContentScale.Inside
                    )
                    Text(
                        text = handle,
                        color = Color.White,
                        fontSize = 20.sp,
                        modifier = modifier
                    )
                }
                Row(modifier = Modifier.padding(top = 15.dp)) {
                    Divider(color = Color.Gray, thickness = 1.dp)
                }
                Row(modifier = Modifier.padding(top = 15.dp)) {
                    Box(modifier = Modifier.padding(start = 40.dp))
                    Image(
                        modifier = Modifier.padding(horizontal = 30.dp),
                        painter = emailIcon,
                        contentDescription = null,
                        contentScale = ContentScale.Inside
                    )
                    Text(
                        text = email,
                        color = Color.White,
                        fontSize = 20.sp,
                        modifier = modifier
                    )
                }
                Row(modifier = Modifier.padding(top = 15.dp)) {
                    Divider(color = Color.Gray, thickness = 1.dp)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardWithImage("Rushda Mansuri", "Software Engineer", "+1 (848) 309 4128", "rm47512n@pace.edu", "@RushdaMansuri")
    }
}