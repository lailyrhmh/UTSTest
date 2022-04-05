package com.example.transportation.data

import com.example.transportation.R
import com.example.transportation.model.Transportation

class Datasource {
    fun loadTransportation(): List<Transportation> {
        return listOf<Transportation>(
            Transportation(R.string.car1, R.string.speedCar1, R.drawable.img1),
            Transportation(R.string.car2, R.string.speedCar2, R.drawable.img2),
            Transportation(R.string.car3, R.string.speedCar3, R.drawable.img3),
            Transportation(R.string.car4, R.string.speedCar4, R.drawable.img4),
            Transportation(R.string.car5, R.string.speedCar5, R.drawable.img5),
            Transportation(R.string.car6, R.string.speedCar6, R.drawable.img6),
            Transportation(R.string.car7, R.string.speedCar7, R.drawable.img7),
            Transportation(R.string.car8, R.string.speedCar8, R.drawable.img8),
            Transportation(R.string.car9, R.string.speedCar9, R.drawable.img9),
            Transportation(R.string.car10, R.string.speedCar10, R.drawable.img10)
        )
    }
}