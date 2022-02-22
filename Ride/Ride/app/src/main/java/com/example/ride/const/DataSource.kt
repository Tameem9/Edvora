package com.example.ride.const

import com.example.ride.model.Ride
import com.example.ride.model.Users

object DataSource {
    val Rides : List<Ride> = listOf(
         Ride("001","23", listOf(23, 42, 45, 48, 56, 60, 77, 81, 93),"98",
             1644924365,"2","Maharashtra","Panvel"

         ),
        Ride("002","20", listOf(20, 39, 40, 42, 54, 63, 72, 88, 98),"98",
            1644924365, "0","Maharashtra","Panvel"

         ),
        Ride("003","13", listOf(13, 25, 41, 48, 59, 64, 75, 81, 91),"91",
            1644924365,"1","Maharashtra","Panvel"


         )
    )
}