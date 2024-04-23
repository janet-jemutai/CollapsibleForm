package com.jemutai.collapsibleform

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
fun PersonalDetailsForm() {

    var firstname by remember { mutableStateOf("") }
    var middlename by remember { mutableStateOf("") }
    var surname by remember { mutableStateOf("") }
    var nationalid by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var phonenumber by remember { mutableStateOf("") }
    var nationality by remember { mutableStateOf("") }



    Column(
        modifier = Modifier
            .fillMaxHeight(0.5f)
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = firstname,
            onValueChange = { firstname = it },
            label = { Text("First Name") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)
        )
        OutlinedTextField(
            value = middlename,
            onValueChange = { middlename = it },
            label = { Text("Middle Name") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = surname,
            onValueChange = { surname = it },
            label = { Text("Sir Name") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = nationalid,
            onValueChange = { nationalid = it },
            label = { Text("National Identification Number") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = gender,
            onValueChange = { gender = it },
            label = { Text("Gender") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = phonenumber,
            onValueChange = { phonenumber = it },
            label = { Text("Phone Number") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = nationality,
            onValueChange = { nationality = it },
            label = { Text("Nationality") },
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
