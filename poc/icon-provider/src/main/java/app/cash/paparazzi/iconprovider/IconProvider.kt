package app.cash.paparazzi.iconprovider

import androidx.annotation.DrawableRes
import androidx.compose.runtime.staticCompositionLocalOf

interface IconProvider {

  @DrawableRes
  fun get(icon: IconId): Int
}

enum class IconId {
  ThumbsUp,
  ThumbsDown,
}

val LocalIconProvider = staticCompositionLocalOf<IconProvider> {
  error("IconProvider was not provided")
}
