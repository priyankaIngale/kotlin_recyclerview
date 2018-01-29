package com.vndroids.android.kotlin_recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row_list_item.view.*

/**
 * Created by android1 on 27/1/18.
 */
public class  DataListAdapter(var userlist:ArrayList<String>): RecyclerView.Adapter<DataListAdapter.Itemviewholder>()
{
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Itemviewholder {
        val v = LayoutInflater.from(parent!!.context).inflate(R.layout.row_list_item, parent, false)
        return Itemviewholder(v)
    }

    override fun onBindViewHolder(holder: DataListAdapter.Itemviewholder, position: Int) {
        holder.bindItems(userlist[position])

    }

    override fun getItemCount(): Int {
        return  userlist.size
    }


    class Itemviewholder(itemview:View):RecyclerView.ViewHolder(itemview) {

        fun bindItems(name: String) {
            itemView.tv_name.text=name

        }

    }


}

