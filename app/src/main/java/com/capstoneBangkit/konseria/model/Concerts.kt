@file:Suppress("DEPRECATION")

package com.capstoneBangkit.konseria.model

import com.capstoneBangkit.konseria.R
import java.sql.Time
import java.util.Date

data class Concerts (
    val concertId : Int,
    val name : String,
    val description : String,
    val company : String,
    val date : Date,
    val time : Time,
    val genre : String,
    val venue : String,
    val city : String,
    val imageURL : Int,
    val venueURL : Int,
    val longitude : Float?,
    val latitude : Float?,
    val type : ConcertType,
    val rate : Int,
)

val dummyCategory = listOf(
    Concerts(
        1,
        "",
        "",
        "",
        Date(2023, 2, 21),
        Time(19, 0, 0),
        "Blues",
        "Austin 1814",
        "Austin 1814 Woodrow Way",
        R.drawable.blues_poster,
        0,
        0F,
        0F,
        ConcertType.OFFLINE,
        0,
    )
)