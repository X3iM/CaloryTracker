package com.greena.onboarding_presentation.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.greena.core_ui.LocalSpacing

@Composable
fun ActionButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnable: Boolean = true,
    textStyle: TextStyle = MaterialTheme.typography.button
) {
    Button(
        onClick = onClick,
        enabled = isEnable,
        modifier = modifier,
        shape = RoundedCornerShape(100.dp)
    ) {
        Text(
            text = text,
            style = textStyle,
            color = MaterialTheme.colors.primary,
            modifier = Modifier.padding(LocalSpacing.current.spaceSmall)
        )
    }
}