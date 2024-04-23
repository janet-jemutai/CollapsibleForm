package com.example.refugee_onboarding.refugee

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
    var enrollmentno by remember { mutableStateOf("") }
    var firstname by remember { mutableStateOf("") }
    var middlename by remember { mutableStateOf("") }
    var surname by remember { mutableStateOf("") }
    var dateofbirth by remember { mutableStateOf("") }
    var nationalid by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var mobilenumber by remember { mutableStateOf("") }
    var nationality by remember { mutableStateOf("") }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = enrollmentno,
            onValueChange = { enrollmentno = it },
            label = { Text("Enrollment No*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)
        )
        OutlinedTextField(
            value = firstname,
            onValueChange = { firstname = it },
            label = { Text("First Name*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)
        )
        OutlinedTextField(
            value = middlename,
            onValueChange = { middlename = it },
            label = { Text("Middle Name*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = surname,
            onValueChange = { surname = it },
            label = { Text("Surname*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = dateofbirth,
            onValueChange = { dateofbirth = it },
            label = { Text("Date Of Birth*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)
        )
        OutlinedTextField(
            value = nationalid,
            onValueChange = { nationalid = it },
            label = { Text("National ID Number*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = gender,
            onValueChange = { gender = it },
            label = { Text("Gender*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = mobilenumber,
            onValueChange = { mobilenumber = it },
            label = { Text("Mobile Numbe*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )
        OutlinedTextField(
            value = nationality,
            onValueChange = { nationality = it },
            label = { Text("Nationality*") },
            modifier = Modifier.padding(bottom = 16.dp),
            shape = RoundedCornerShape(20.dp)

        )


    }

}