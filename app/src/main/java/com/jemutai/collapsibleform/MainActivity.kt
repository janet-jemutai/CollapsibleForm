package com.jemutai.collapsibleform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.refugee_onboarding.refugee.PersonalAddressForm
import com.example.refugee_onboarding.refugee.PersonalDetailsForm
import com.jemutai.collapsibleform.ui.theme.CollapsibleFormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CollapsibleFormTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PersonalDetailsSection()
                }
            }
        }
    }
}


@Composable
fun PersonalDetailsSection() {
    var isVisiblePersonalDetails by remember { mutableStateOf(false) }
    var isVisiblePersonalAddress by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        // Personal Details Section
        PersonalDetailsCollapsibleSection(isVisible = isVisiblePersonalDetails) {
            isVisiblePersonalDetails = it
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Personal Address Section
        PersonalAddressCollapsibleSection(
            isVisible = isVisiblePersonalAddress,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            isVisiblePersonalAddress = it
        }
    }
}


@Composable
fun PersonalDetailsCollapsibleSection(
    isVisible: Boolean,
    onToggleVisibility: (Boolean) -> Unit
)

{
    var iconState by remember { mutableStateOf(Icons.Rounded.KeyboardArrowDown) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .clickable {
                    onToggleVisibility(!isVisible)
                    iconState = if (isVisible) {
                        Icons.Rounded.KeyboardArrowUp
                    } else {
                        Icons.Rounded.KeyboardArrowDown
                    }
                }
                .background(color = Color.Red),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Beneficiary Personal Details",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Icon(
                imageVector = iconState,
                contentDescription = "Collapse/Expand",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.align(Alignment.CenterEnd)
            )
        }
    }

    if (isVisible) {
        PersonalDetailsForm()
    }
}

@Composable
fun PersonalAddressCollapsibleSection(
    isVisible: Boolean,
    modifier: Modifier = Modifier,
    onToggleVisibility: (Boolean) -> Unit
) {
    var iconState by remember { mutableStateOf(Icons.Rounded.KeyboardArrowDown) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .clickable {
                    onToggleVisibility(!isVisible)
                    iconState = if (isVisible) {
                        Icons.Rounded.KeyboardArrowUp
                    } else {
                        Icons.Rounded.KeyboardArrowDown
                    }
                }
                .background(color = Color.Red),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Personal Address",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Icon(
                imageVector = iconState,
                contentDescription = "Collapse/Expand",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.align(Alignment.CenterEnd)
            )
        }
    }

    if (isVisible) {
        PersonalAddressForm()
    }
}


