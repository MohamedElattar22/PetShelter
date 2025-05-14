package org.iamelattar.petshelter.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable
import org.iamelattar.petshelter.presentation.SplashScreenComp
import org.iamelattar.petshelter.presentation.home.HomeScreen

@Serializable
object SplashScreen

@Serializable
object HomeScreen


@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SplashScreen) {
        composable<SplashScreen> { SplashScreenComp(navController = navController) }
        composable<HomeScreen> { HomeScreen() }

    }

}