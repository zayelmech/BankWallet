package com.imecatro.bankwallet.ui.home.presenter

import com.imecatro.bankwallet.ui.home.FavoriteTransfer
import com.imecatro.bankwallet.ui.home.HomeContract
import com.imecatro.bankwallet.ui.home.data.HomeInteractor
import kotlinx.coroutines.*

class HomePresenter(
    private val view: HomeContract.View
) : HomeContract.Presenter {

    private val homeInteractor: HomeInteractor = HomeInteractor()

    override fun retrieveFavoriteTransfers() {

        CoroutineScope(Dispatchers.Main).launch {
            view.showLoader()
            delay(2000)
            homeInteractor.retrieveFavoriteTransferFromCache(object :
                HomeContract.OnResponseCallback {
                override suspend fun onResponse(favoriteList: List<FavoriteTransfer>) {
                    view.hideLoader()
                    view.showFavoriteTransfers(favoriteList)

                }
            })
        }
    }
}