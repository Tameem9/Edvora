package com.example.ride.rideCardaAaptor


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ride.R
import com.example.ride.const.DataSource
import java.text.SimpleDateFormat
import java.util.*

class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>( ){
private val rideData=DataSource.Rides

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
                holder.id.text="Ride id: "+rideData[position].id
                holder.originStation.text="Origin State :"+rideData[position].origin_station_code
                holder.date.text="Date :"+convertLongToTime(rideData[position].date,position)
                holder.distance.text="Distance : "+rideData[position].distance
                holder.stationPath.text="StationPath : "+rideData[position].station_path
                holder.item_image.setImageResource(R.drawable.image_1)
                holder.cityName.text=rideData[position].city
                holder.stateName.text=rideData[position].state
    }

    override fun getItemCount(): Int {
            return rideData.size
    }

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        val item_image:ImageView
        val id :TextView
        val originStation:TextView
        val stationPath :TextView
        val date :TextView
        val distance:TextView
        val cityName:TextView
        val stateName:TextView
            init {
                item_image=itemView.findViewById(R.id.item_image)
                id=itemView.findViewById(R.id.id)
                originStation=itemView.findViewById(R.id.Origin_station)
                stationPath=itemView.findViewById(R.id.station_path)
                date=itemView.findViewById(R.id.Date)
                distance=itemView.findViewById(R.id.Distance)
                cityName=itemView.findViewById(R.id.CityName)
                stateName=itemView.findViewById(R.id.StateName)
}

        }
    fun convertLongToTime(time: Long,position: Int): String {
        val date = Date(time)
        val format = SimpleDateFormat("dd.MM.yyyy HH:mm")
        return format.format(date)
    }

    fun currentTimeToLong(): Long {
        return System.currentTimeMillis()
    }

    fun convertDateToLong(date: String): Long {
        val df = SimpleDateFormat("dd.MM.yyyy HH:mm")
        return df.parse(date).time
    }



    }

