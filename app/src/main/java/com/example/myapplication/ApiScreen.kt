package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.myapplication.com.example.myapplication.data.model.Disney
import com.example.myapplication.com.example.myapplication.viewmodel.DisneyViewModel
import org.w3c.dom.Document

@Composable
fun ApiScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Tervetuloa!", style = MaterialTheme.typography.titleLarge)
        Text(text = "Tämä on Api ikkuna", style = MaterialTheme.typography.labelSmall)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {navController.navigate("home")}) {
            Text("Mene aloitusruutuun!")
        }
        DisneyApp()
    }
}

@Composable
fun DisneyApp(disneyViewModel: DisneyViewModel = viewModel()) {
    val disney by disneyViewModel.disney.collectAsState()

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(disney) { character ->
                DisneyCard(character)

            }
        }
    }
}

@Composable
fun DisneyCard(character: Disney) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp),
        colors = CardDefaults.cardColors(
            contentColor = Color(0xFF4CAFA0)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = character.name, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = character.species, style = MaterialTheme.typography.labelSmall)
            Text(text = character.residence, style = MaterialTheme.typography.labelSmall)
            Text(text = character.occupation, style = MaterialTheme.typography.labelSmall)
            Text(text = character.catchphrase, style = MaterialTheme.typography.labelSmall)
        }
    }
}