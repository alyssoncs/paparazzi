package app.cash.paparazzi.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import app.cash.paparazzi.iconprovider.IconId
import app.cash.paparazzi.iconprovider.IconProvider
import app.cash.paparazzi.iconprovider.LocalIconProvider

@Composable
fun CustomButton(
  text: String,
  modifier: Modifier = Modifier,
  onClick: () -> Unit,
) {
  val iconProvider = LocalIconProvider.current
  Button(
    onClick = onClick,
    modifier = modifier,
  ) {
    Row(
      horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
      Icon(
        painter = painterResource(id = iconProvider.get(IconId.ThumbsDown)),
        contentDescription = null
      )
      Text(text = text)
      Icon(
        painter = painterResource(id = iconProvider.get(IconId.ThumbsUp)),
        contentDescription = null
      )
    }
  }
}

@Composable
@Preview
@Suppress("UNCHECKED_CAST")
private fun CustomButtonPreview() {
  val iconProviderName = "app.cash.paparazzi.defaulticonprovider.DefaultIconProvider"
  val iconProviderClass = Class.forName(iconProviderName)
  val iconProvider = iconProviderClass.getDeclaredConstructor().newInstance()

  CompositionLocalProvider(
    LocalIconProvider provides iconProvider as IconProvider
  ) {

    CustomButton(
      text = "do something!",
    ) {

    }
  }
}
