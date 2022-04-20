package com.greena.calorytracker.navigation

import androidx.navigation.NavController
import com.greena.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}