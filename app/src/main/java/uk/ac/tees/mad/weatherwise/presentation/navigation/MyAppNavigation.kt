package uk.ac.tees.mad.weatherwise.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uk.ac.tees.mad.weatherwise.presentation.ui.MainScreen
import uk.ac.tees.mad.weatherwise.presentation.ui.SplashScreen

@Composable
fun MyAppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.SplashScreen.route) {

        composable(Screens.SplashScreen.route){
            SplashScreen(navController)
        }

        composable(Screens.MainScreen.route) {
            MainScreen(navController)
        }

    }
}