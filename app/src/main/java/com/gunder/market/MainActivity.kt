package com.gunder.market

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.components.MainTopBar
import com.gunder.market.components.TopMenu
import com.gunder.market.model.dummyListTopBar
import com.gunder.market.ui.theme.MarketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarketTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        MarketApp()

                    }
                }
            }
        }
    }

@Composable
fun MarketApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
        MainTopBar()
        MainTopMenu()
    }

}

@Composable
fun MainTopMenu() {
    LazyRow(modifier = Modifier.padding(4.dp)) {
        items(dummyListTopBar){
            TopMenu(listTopMenu = it)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun MainTopMenuPreview() {
    MarketTheme {
        MainTopMenu()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MarketAppPreview() {
    MarketTheme {
        MarketApp()
    }
}