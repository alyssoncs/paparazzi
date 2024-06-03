package app.cash.paparazzi.defaulticonprovider

import app.cash.paparazzi.iconprovider.IconId
import app.cash.paparazzi.iconprovider.IconProvider

class DefaultIconProvider : IconProvider {

  override fun get(icon: IconId): Int {
    return when (icon) {
      IconId.ThumbsUp -> R.drawable.thumbs_up
      IconId.ThumbsDown -> R.drawable.thumbs_down
    }
  }
}
