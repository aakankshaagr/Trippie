package com.example.triippie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.triippie.adapter.PlaceAdapter
import com.example.triippie.model.Datasource


class TripActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trip)
        val dataset=Datasource().loadPlaces()
        val recyclerView=findViewById<RecyclerView>(R.id.place_recycler_view)
        recyclerView.adapter= PlaceAdapter(this,dataset)
        recyclerView.setHasFixedSize(true)

    }
}