package com.example.mvvmkotlinexample.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmkotlinexample.R
import com.example.mvvmkotlinexample.model.IssuesDataClass

class CustomAdapter(private val mContext:Context, private val mList: List<IssuesDataClass>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = mList[position]
        Glide.with(mContext)
            .load(items.user?.avatarUrl)
            .into(holder.imageView)
        holder.title.text = items.title
        holder.name.text = items.user?.login
        holder.created_at.text = items.createdAt
        holder.closed_at.text = items.updatedAt
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val title: TextView = itemView.findViewById(R.id.title)
        val name: TextView = itemView.findViewById(R.id.username)
        val created_at:TextView = itemView.findViewById(R.id.created_at)
        val closed_at:TextView = itemView.findViewById(R.id.closed_at)
    }
}