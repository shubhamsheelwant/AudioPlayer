package com.example.audioplayer.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.audioplayer.Model.SongItemModel
import com.example.audioplayer.R
import com.example.audioplayer.databinding.LayoutSongItemBinding

class SongItemsAdapter (var mContext: Context, var data: ArrayList<SongItemModel>) : RecyclerView.Adapter<SongItemsAdapter.ViewHolder>()
{
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding: LayoutSongItemBinding =
                LayoutSongItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutSongItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
        ).root
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: SongItemsAdapter.ViewHolder, position: Int) {
        val songItem: SongItemModel = data.get(position)
        viewHolder.binding.name.setText(songItem.name)
        viewHolder.binding.genres.setText(songItem.generes)
        viewHolder.binding.singer.setText(songItem.singer)
        viewHolder.binding.duration.setText(songItem.duration)

        viewHolder.binding.songImage.load(R.drawable.image3)

    }

    override fun getItemCount(): Int {
        return data.size
    }
}