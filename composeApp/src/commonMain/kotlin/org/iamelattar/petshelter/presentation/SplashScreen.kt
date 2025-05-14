package org.iamelattar.petshelter.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import org.iamelattar.petshelter.navigation.HomeScreen
import org.iamelattar.petshelter.theme.buttonBackground
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import petshelter.composeapp.generated.resources.Res
import petshelter.composeapp.generated.resources.background
import petshelter.composeapp.generated.resources.takee

@Composable
fun SplashScreenComp(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(Res.drawable.background),
            contentScale = ContentScale.Crop,
            contentDescription = "Background"
        )
        Column(
            modifier = Modifier.fillMaxSize().statusBarsPadding(),
        ) {
            Spacer(modifier = Modifier.height(25.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(Res.drawable.takee),
                    contentDescription = "Logo"
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(bottom = 25.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Happines is closer than you think !",
                    modifier = Modifier.padding(10.dp),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Spacer(modifier.height(20.dp))

                Button(
                    onClick = {
                        navController.navigate(HomeScreen)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .height(60.dp)
                        .clip(
                            shape = RoundedCornerShape(30.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = buttonBackground
                    )
                ) {

                    Text(
                        "Let's Go!",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }

            }


        }

    }


}


