package com.vinted.demovinted.data.models

import java.math.BigDecimal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//to pass between fragments
@Parcelize
data class CatalogItem(
    val id: Int = 0,
    val title: String = "",
    val price: BigDecimal = BigDecimal.ONE,
    private val photo: String = "",
    private val brand: String = "",
    val category: String = ""
) : Parcelable {

    var searchScore: String? = null

    val mainPhoto: Photo
        get() = Photo(url = "http://mobile-homework-api.vinted.net/images/$photo")

    val itemBrand: ItemBrand
        get() = ItemBrand.createNoBrand(brand)
}