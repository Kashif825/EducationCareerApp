package com.example.educationcareer
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ArticleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
val frontImage: ImageView = itemView.findViewById(R.id.frontImage)
    val title: TextView = itemView.findViewById(R.id.headline)
    val shortdes: TextView = itemView.findViewById(R.id.categoryD)
    val date:TextView = itemView.findViewById(R.id.date)

}

