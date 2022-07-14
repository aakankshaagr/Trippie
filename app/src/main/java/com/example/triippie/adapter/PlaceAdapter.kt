package com.example.triippie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.triippie.R
import com.example.triippie.model.Places


class PlaceAdapter(private val context: Context, private val dataset:List<Places>):
        RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>(){
        class PlaceViewHolder(private val view: View):RecyclerView.ViewHolder(view){
            val textView:TextView =view.findViewById(R.id.place_title)
            val imageView:ImageView=view.findViewById(R.id.place_img)
        }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.activity_find_location,parent,false)
        return PlaceViewHolder(adapterLayout)

    }
    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
       val place=dataset[position]
        holder.textView.text=context.resources.getString(place.stringResourceId)
        holder.imageView.setImageResource(place.imageResourceId)

    }
    }
