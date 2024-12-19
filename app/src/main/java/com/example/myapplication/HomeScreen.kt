package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Tervetuloa!", style = MaterialTheme.typography.titleLarge)
        Text(text = "Tämä on aloitusikkuna", style = MaterialTheme.typography.labelSmall)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {navController.navigate("details")}) {
            Text("Mene Tekijään!")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {navController.navigate("api")}) {
            Text("Mene Api valikkoon!")
        }
    }
}

// Jatka
// https://kareliauas-my.sharepoint.com/personal/seppo_nevalainen_karelia_fi/_layouts/15/stream.aspx?id=%2Fpersonal%2Fseppo%5Fnevalainen%5Fkarelia%5Ffi%2FDocuments%2FKurssit%2FMobiiliohjelmointi%2FLuentotallenteet%2Fvideo1758776487%2Emp4&ga=1&referrer=StreamWebApp%2EWeb&referrerScenario=AddressBarCopied%2Eview%2E08cc920e%2D3e8f%2D4591%2D9325%2Db6afebf3cddc
// 37:52