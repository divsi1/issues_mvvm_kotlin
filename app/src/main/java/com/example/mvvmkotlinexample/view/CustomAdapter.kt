package com.example.mvvmkotlinexample.view

//class CustomAdapter {
//}
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
import kotlinx.android.synthetic.main.card_view_design.view.*

class CustomAdapter(private val mContext:Context, private val mList: List<IssuesDataClass>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
//        holder.imageView.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        Glide.with(mContext)
            .load(ItemsViewModel.user?.avatarUrl)
            .into(holder.imageView)
        holder.title.text = ItemsViewModel.title
        holder.description.text = ItemsViewModel.body
        holder.name.text = ItemsViewModel.user?.login
        holder.updated_at.text = ItemsViewModel.updatedAt

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val title: TextView = itemView.findViewById(R.id.title)
        val description: TextView = itemView.findViewById(R.id.description)
        val name: TextView = itemView.findViewById(R.id.username)
        val updated_at: TextView = itemView.findViewById(R.id.updated_at)
    }
}