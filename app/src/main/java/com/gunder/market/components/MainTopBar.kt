package com.gunder.market.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.R
import com.gunder.market.ui.theme.MarketTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(modifier: Modifier = Modifier) {
    Column(modifier.padding(16.dp)) {
        Row(
            modifier = modifier.width(IntrinsicSize.Max),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlinedTextField(modifier = modifier.widthIn(min = 235.dp),
                value = "",
                onValueChange = {},
                placeholder = { Text(text = stringResource(R.string.txt_search_here)) },
                leadingIcon = {
                    Icon(
                        Icons.Default.Search, null
                    )
                })
            Icon(
                imageVector = Icons.Outlined.Email,
                contentDescription = "outlined email",
                modifier = modifier.size(24.dp)
            )
            Icon(
                imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = "Shopping cart icon",
                modifier = modifier.size(24.dp)
            )
            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = "Notification icon",
                modifier = modifier.size(24.dp)
            )
            Icon(
                imageVector = Icons.Outlined.Menu,
                contentDescription = "Menu Icon",
                modifier = modifier.size(24.dp)
            )
        }
        Row(
            modifier = modifier.padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Outlined.LocationOn,
                contentDescription = "Location Icon",
                modifier = modifier.size(18.dp)
            )
            Text(text = stringResource(R.string.txt_address), fontSize = 12.sp)
            Text(
                text = stringResource(R.string.txt_name),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(
                imageVector = Icons.Outlined.KeyboardArrowDown,
                contentDescription = "KeyboardArrowDown Icon"
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun MainTopBarPreview() {
    MarketTheme {
        MainTopBar()
    }
}