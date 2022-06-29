package com.kimminju99.recyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kimminju99.recyclerview.ui.theme.RecyclerviewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecyclerviewTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Scaffold(
        backgroundColor = MaterialTheme.colors.background
    ) {
        RecyclerViewContent()
    }
}

@Composable
fun RecyclerViewContent() {
    val puppies = remember { DataProvider.puppyList }
    LazyColumn(contentPadding = PaddingValues(16.dp, 8.dp)) {
        items(
            items = puppies,
            itemContent = { PuppyListItem(it) }
        )
    }
}

@Composable
fun PuppyListItem(puppy: Puppy) {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RecyclerviewTheme {
        MyApp()
    }
}