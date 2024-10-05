package com.gunder.market.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListCardForYou
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainBannerVertical(modifier: Modifier = Modifier, listBanner: ListCardForYou) {
    Card(
        modifier = modifier.padding(start = 16.dp, bottom = 8.dp, end = 4.dp, top = 16.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
    ) {
        Image(painter = painterResource(id = listBanner.imgCard), contentDescription = null)
    }
}

@Preview(showBackground = true)
@Composable
private fun MainBannerVerticalPreview() {
    MarketTheme {
        MainBannerVertical(
            listBanner = ListCardForYou(
                R.drawable.banner_vertikal1,
                R.string.txt_desc_first_banner
            )
        )
    }
}