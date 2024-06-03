package app.cash.paparazzi.ui

import androidx.compose.runtime.CompositionLocalProvider
import app.cash.paparazzi.Paparazzi
import app.cash.paparazzi.iconprovider.IconProvider
import app.cash.paparazzi.iconprovider.LocalIconProvider
import org.junit.Rule
import org.junit.Test

class CustomButtonTest {
  @get:Rule
  val paparazzi = Paparazzi()

  @Test
  fun `test compose`() {
    paparazzi.snapshot {
      val iconProviderName = "app.cash.paparazzi.defaulticonprovider.DefaultIconProvider"
      val iconProviderClass = Class.forName(iconProviderName)
      val iconProvider = iconProviderClass.getDeclaredConstructor().newInstance()

      CompositionLocalProvider(
        LocalIconProvider provides iconProvider as IconProvider
      ) {
        CustomButton(text = "do something!") {
          // nothing
        }
      }
    }
  }
}
