package com.udacity.shoestore.shoelist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

const val DESC_AIR_JORDAN = "No such thing as a perfect marriage, but this one comes pretty close."
const val DESC_ULTRA_BOOST = "Experience epic energy in every stride with the Ultraboost Light"

class ShoeListViewModel : ViewModel() {
    private val _shoes = MutableLiveData<MutableList<Shoe>>();
    val shoes: LiveData<MutableList<Shoe>>
        get() = _shoes

    init {
        _shoes.value = mutableListOf(
            Shoe(
                name = "Air Jordan Men",
                size = 7.5,
                company = "Nike",
                description = DESC_AIR_JORDAN
            ),
            Shoe(
                name = "Air Jordan Men",
                size = 8.0,
                company = "Nike",
                description = DESC_AIR_JORDAN
            ),
            Shoe(
                name = "Air Jordan Men",
                size = 8.5,
                company = "Nike",
                description = DESC_AIR_JORDAN
            ),
            Shoe(
                name = "Air Jordan Men",
                size = 9.0,
                company = "Nike",
                description = DESC_AIR_JORDAN
            ),
            Shoe(
                name = "Air Jordan Men",
                size = 9.5,
                company = "Nike",
                description = DESC_AIR_JORDAN
            ),
            Shoe(
                name = "Air Jordan Men",
                size = 10.0,
                company = "Nike",
                description = DESC_AIR_JORDAN
            ),
            Shoe(
                name = "UltraBoost Light",
                size = 6.0,
                company = "Adidas",
                description = DESC_ULTRA_BOOST
            ),
            Shoe(
                name = "UltraBoost Light",
                size = 6.5,
                company = "Adidas",
                description = DESC_ULTRA_BOOST
            ),
            Shoe(
                name = "UltraBoost Light",
                size = 7.0,
                company = "Adidas",
                description = DESC_ULTRA_BOOST
            ),
            Shoe(
                name = "UltraBoost Light",
                size = 7.5,
                company = "Adidas",
                description = DESC_ULTRA_BOOST
            ),
            Shoe(
                name = "UltraBoost Light",
                size = 8.0,
                company = "Adidas",
                description = DESC_ULTRA_BOOST
            ),
            Shoe(
                name = "UltraBoost Light",
                size = 8.5,
                company = "Adidas",
                description = DESC_ULTRA_BOOST
            ),
            Shoe(
                name = "UltraBoost Light",
                size = 9.0,
                company = "Adidas",
                description = DESC_ULTRA_BOOST
            ),
            Shoe(
                name = "UltraBoost Light",
                size = 9.5,
                company = "Adidas",
                description = DESC_ULTRA_BOOST
            ),
        )
    }
}