package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailsScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Tervetuloa!", style = MaterialTheme.typography.titleLarge)
        Text(text = "Tämä on details ikkuna", style = MaterialTheme.typography.labelSmall)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {navController.navigate("home")}) {
            Text("Mene aloitusruutuun!")
        }
        Text("Tekijä: Niko Niemelä, kurssille DT10048-3001", style = MaterialTheme.typography.labelSmall)
    }
}
