package Lenstules

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LensStyleAdapter(
    private val items: List<LensStyle>,
    private val onClick: (LensStyle) -> Unit
) : RecyclerView.Adapter<LensStyleAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(lensStyle: LensStyle) {
            itemView.setOnClickListener { onClick(lensStyle) }
            // TODO: Bind UI preview, etc.
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }
}
