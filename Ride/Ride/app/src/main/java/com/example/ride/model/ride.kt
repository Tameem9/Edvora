package com.example.ride.model



data class Ride (

    val id :String,
    val origin_station_code:String,
    val station_path:List<Int>,
    val destination_station_code: String,
    val date: Long,
    val distance :String,
    val state: String,
    val city: String

)