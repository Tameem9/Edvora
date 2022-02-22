package com.example.ride

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ride.rideCardaAaptor.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
private var LayoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder> ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.setHasFixedSize(true)
        val btn1 = findViewById(R.id.button1) as Button

        val btn2 = findViewById(R.id.button2) as Button

        val btn3 = findViewById(R.id.button3) as Button

        btn1.setOnClickListener {
            Toast.makeText(this@MainActivity, "The Nearest Ride  is Ride 002", Toast.LENGTH_SHORT).show()
        }
        


        LayoutManager=LinearLayoutManager(this)

        recyclerView.layoutManager=LayoutManager
        adapter=RecyclerAdapter()
        recyclerView.adapter=adapter
    }

}