package com.delaroystudios

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.delaroystudios.recyclerview.R
import kotlinx.android.synthetic.main.row_item.view.*

class CustomAdapter(val modelList: List<Model>, val context: Context) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).bind(modelList.get(position));
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.row_item, parent, false))
    }


    override fun getItemCount(): Int {
        return modelList.size;
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(model: Model): Unit {
            itemView.txt.text = model.name
            itemView.sub_txt.text = model.version
        }
    }

}