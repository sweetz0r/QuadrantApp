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
                    QuadrantApp(
                        textComposabl = stringResource(R.string.text_composable),
                        imageComposabl = stringResource(R.string.image_composable),
                        rowComposabl = stringResource(R.string.row_composable),
                        columnComposabl = stringResource(R.string.column_composable)
                    )
                }
            }
        }
    }
}
@Composable
fun QuadrantApp(textComposabl: String, imageComposabl: String, rowComposabl: String, columnComposabl: String, modifier: Modifier = Modifier) {
    Box {
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .background(Color.Blue)
        ) {
            Text(
                text = columnComposabl,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 16.dp)
            )
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .background(Color.Red)

            ) {
                Text(
                    text = rowComposabl,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )

            }

        }
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .background(Color.White)
        ) {
            Text(
                text = textComposabl,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 16.dp)
            )
            Row(
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .background(Color.Green)

            ) {
                Text(
                    text = imageComposabl,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantAppTheme {
        QuadrantApp(
            textComposabl = stringResource(R.string.text_composable),
            imageComposabl = stringResource(R.string.image_composable),
            rowComposabl = stringResource(R.string.row_composable),
            columnComposabl = stringResource(R.string.column_composable)
        )
    }
}