package com.example.educationcareer
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
//import androidx.educationcareer.widget.RecyclerView.Recycler

class ArticlesAdapter(val articles: List<Article>): RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articles.get(position)
        holder.title.text = article.title
        holder.frontImage.setImageResource(article.image)
        holder.shortdes.text = article.shortDes
        holder.date.text = article.date

       holder.itemView.setOnClickListener {

           val intent = Intent(holder.itemView.context, ArticleDetailsActivity::class.java)
           intent.putExtra("title", article.title)
           intent.putExtra("category", article.shortDes)
           intent.putExtra("date", article.date)
           intent.putExtra("image", article.image)
           intent.putExtra("detail", article.detail)

           holder.itemView.context.startActivity(intent)
       }
    }
}