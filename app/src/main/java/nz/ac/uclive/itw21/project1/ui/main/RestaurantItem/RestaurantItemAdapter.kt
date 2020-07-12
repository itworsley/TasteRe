package nz.ac.uclive.itw21.project1.ui.main.RestaurantItem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import nz.ac.uclive.itw21.project1.R

class RestaurantItemAdapter(private val restaurantList: List<RestaurantItem>) : RecyclerView.Adapter<RestaurantItemAdapter.RestaurantItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.restaurant_item,
            parent, false)
        return RestaurantItemViewHolder(
            itemView
        )
    }

    override fun onBindViewHolder(holder: RestaurantItemViewHolder, position: Int) {
        val currentItem = restaurantList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.restaurantTitle.text = currentItem.restaurantTitle
        holder.restaurantSubtitle.text = currentItem.restaurantSubtitle
    }

    override fun getItemCount() = restaurantList.size

    /**
     * A view holder represents a single row in our list, one instance of it contains one instance
     * the Restaurant item. This caches these views, so they can be accessed quickly rather than
     * every time the screen scrolls.
     */
    class RestaurantItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.restaurant_item_icon)
        val restaurantTitle: TextView = itemView.findViewById(R.id.restaurant_item_title)
        val restaurantSubtitle: TextView = itemView.findViewById(R.id.restaurant_item_subtitle)
    }
}