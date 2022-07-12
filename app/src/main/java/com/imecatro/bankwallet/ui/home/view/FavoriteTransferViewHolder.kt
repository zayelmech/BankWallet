package com.imecatro.bankwallet.ui.home.view

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.imecatro.bankwallet.R
import com.imecatro.bankwallet.ui.home.FavoriteTransfer
import com.squareup.picasso.Picasso

class FavoriteTransferViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(item: FavoriteTransfer) {
        val photoImageView = view.findViewById<ImageView>(R.id.profilePhotoImageView)
        Picasso.get().load(item.photoUrl).into(photoImageView)
    }
}