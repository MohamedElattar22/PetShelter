package org.iamelattar.petshelter.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable
import org.iamelattar.petshelter.data.datasource.RemoteDS
import org.iamelattar.petshelter.data.repository.TestRepoImp
import org.iamelattar.petshelter.presentation.SplashScreenComp
import org.iamelattar.petshelter.presentation.home.HomeScreen
import org.iamelattar.petshelter.presentation.home.HomeViewModel

@Serializable
object SplashScreen

@Serializable
object HomeScreen


@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SplashScreen) {
        composable<SplashScreen> { SplashScreenComp(navController = navController) }
        composable<HomeScreen> {
            val viewModel = viewModel<HomeViewModel> {
                HomeViewModel(TestRepoImp(RemoteDS()))
            }
            HomeScreen(viewModel)

        }

    }

}