package com.example.refugee_onboarding.refugee

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PersonalAddressForm() {

    var county by remember { mutableStateOf("") }
    var constituency by remember { mutableStateOf("") }
    var district by remember { mutableStateOf("") }
    var division by remember { mutableStateOf("") }
    var location by remember { mutableStateOf("") }
    var sublocation by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = county,
            onValueChange = { county = it },
            label = { Text("County*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)
        )
        OutlinedTextField(
            value = constituency,
            onValueChange = { constituency = it },
            label = { Text("Constituency*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = district,
            onValueChange = { district = it },
            label = { Text("District*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = division,
            onValueChange = { division = it },
            label = { Text("Division*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = location,
            onValueChange = { location = it },
            label = { Text("Location*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = sublocation,
            onValueChange = { sublocation = it },
            label = { Text("Sublocation*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )



        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(16.dp),
            // colors = ButtonColors = buttonColors(Color.Red)


        ) {
            Text(text = "Save/Next")
        }

    }

}
