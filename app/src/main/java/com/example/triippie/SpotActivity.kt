package com.example.triippie


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.RecyclerView
import com.example.triippie.adapter.PlaceAdapter
import com.example.triippie.adapter.SpotAdapter
import com.example.triippie.model.*

import kotlinx.android.synthetic.main.activity_trip_plan.*

class SpotActivity : AppCompatActivity() {
    private lateinit var place:TextView
    private lateinit var dataset:List<Spot>
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_trip_plan)
            val bundle:Bundle?=intent.extras
            place=findViewById(R.id.place)

            val position=bundle!!.getString("position")
            val heading=bundle!!.getString("heading")
            place.text=heading
            dataset = when (position) {
                "0" -> {
                    KotaData().loadSpots()
                }
                "1" -> {
                    MumbaiData().loadSpots()
                }
                "2" -> {
                    Kashmir().loadSpots()
                }
                else -> {SevenSisterData().loadSpots()}
            }
            val recyclerView=findViewById<RecyclerView>(R.id.spot_recycler_view)
            recyclerView.adapter= SpotAdapter(this,dataset)
            recyclerView.setHasFixedSize(true)

        }
    }



