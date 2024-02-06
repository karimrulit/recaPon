package ru.example.recapon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.example.recapon.databinding.ZombeItemBinding

class ZombeAdapter: RecyclerView.Adapter<ZombeAdapter.ZombeHolder>() {
    val zombeList = ArrayList<Pony>()
    class ZombeHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = ZombeItemBinding.bind(item)
        fun bind(pony: Pony) = with(binding) {
            im.setImageResource(pony.imageId)
            tvTitle.text = pony.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZombeHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.zombe_item, parent, false)
        return ZombeHolder(view)
    }

    override fun onBindViewHolder(holder: ZombeHolder, position: Int) {
        holder.bind(zombeList[position])
    }

    override fun getItemCount(): Int {
        return zombeList.size
    }

    fun addZombe(pony: Pony) {
        zombeList.add(pony)
        notifyDataSetChanged()
    }
}