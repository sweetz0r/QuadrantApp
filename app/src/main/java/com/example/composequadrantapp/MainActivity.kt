package com.example.composequadrantapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrantapp.ui.theme.ComposeQuadrantAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}
@Composable
fun QuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f))

         {
            QuadrantPiece(
                title = stringResource(R.string.first_title),
                description = stringResource(R.string.first_description),
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .weight(1f)
            )
            QuadrantPiece(
                title = stringResource(R.string.second_title),
                description = stringResource(R.string.second_description),
                modifier = Modifier
                    .background(Color(0xFFD0BCFF))
                    .weight(1f)
            )
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            QuadrantPiece(
                title = stringResource(R.string.third_title),
                description = stringResource(R.string.third_description),
                modifier = Modifier
                    .background(Color(0xFFB69DF8))
                    .weight(1f)
            )
            QuadrantPiece(
                title = stringResource(R.string.fourth_title),
                description = stringResource(R.string.fourth_description),
                modifier = Modifier
                    .background(Color(0xFFF6EDFF))
                    .weight(1f)
            )
        }
    }


}

@Composable
fun QuadrantPiece(title: String,description: String,modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify

        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantAppTheme {

    }
}