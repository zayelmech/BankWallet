package com.imecatro.bankwallet.ui.home.data

import com.imecatro.bankwallet.ui.home.FavoriteTransfer
import com.imecatro.bankwallet.ui.home.HomeContract
import kotlinx.coroutines.delay

class HomeInteractor {
    suspend fun retrieveFavoriteTransferFromCache(responseCallback: HomeContract.OnResponseCallback) {
        val items = ArrayList<FavoriteTransfer>()
        items.add(
            FavoriteTransfer(
                1,
                "Freddy Vega",
                456.000,
                "Hace 2h",
                "https://media.licdn.com/dms/image/C4E03AQGlqpsnWjB6Yg/profile-displayphoto-shrink_200_200/0?e=1582761600&v=beta&t=dYj3_HcoKdR66KpEup0FPBTziu8xiF2I2snqJbf4DGM"
            )
        )
        items.add(
            FavoriteTransfer(
                1,
                "Nestor Villamil",
                210.900,
                "Ayer",
                "https://krausefx.com/assets/posts/profilePictures/FelixKrause2016.jpg"
            )
        )
        items.add(
            FavoriteTransfer(
                1,
                "Fernando Ávila",
                456.000,
                "Hace 2h",
                "https://www.oliverwyman.com/content/dam/oliver-wyman/v2/careers/profiles/scottbk-profile-460x460.jpg"
            )
        )
        items.add(
            FavoriteTransfer(
                1,
                "Cristian Villamil",
                456.000,
                "Hace 2h",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTw8mKnjVErhmhl5S_aUZfvf86vwZOMJBqbUqM-guT-kv6K4xu&s"
            )
        )
        items.add(
            FavoriteTransfer(
                1,
                "Cristian Villamil",
                456.000,
                "Hace 2h",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVSEHZQ2HJu9FEzFLU4yEAUv46sfRQjxUYkiVv7IEFxNndQ_7C&s"
            )
        )
        responseCallback.onResponse(items)
    }
}