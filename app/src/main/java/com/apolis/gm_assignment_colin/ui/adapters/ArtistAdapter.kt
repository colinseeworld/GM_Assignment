package com.apolis.gm_assignment_colin.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.apolis.gm_assignment_colin.data.Artist
import com.apolis.gm_assignment_colin.databinding.HolderArtistBinding
import com.apolis.gm_assignment_colin.ui.hodlers.ArtistHolder

class ArtistAdapter(var list: List<Artist>): RecyclerView.Adapter<ArtistHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = HolderArtistBinding.inflate(layoutInflater, parent, false)
        return ArtistHolder(binding)
    }

    override fun onBindViewHolder(holder: ArtistHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

     fun setNewList(myList: List<Artist>) {
         this.list = myList
         notifyDataSetChanged()
    }
}