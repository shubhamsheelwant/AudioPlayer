package com.example.audioplayer.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.audioplayer.Adapter.SongItemsAdapter
import com.example.audioplayer.Model.SongItemModel
import com.example.audioplayer.R
import com.example.audioplayer.databinding.ActivitySongsListBinding

class SongsListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySongsListBinding

    var songItemsList: ArrayList<SongItemModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongsListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initList()
        initAdapter()
    }

    private fun initList() {
        songItemsList.add(SongItemModel("http://4.bp.blogspot.com/-ww35TX848nE/VwKzp_AExYI/AAAAAAAAACA/juHbkc0DQE4D_LLzUrldo1oQqrY6WV6lA/s1600/apple_HLS.png","Song 1","Genres 1","Singer 1", "06:00 min" ))
        songItemsList.add(SongItemModel("http://4.bp.blogspot.com/-ww35TX848nE/VwKzp_AExYI/AAAAAAAAACA/juHbkc0DQE4D_LLzUrldo1oQqrY6WV6lA/s1600/apple_HLS.png","Song 2","Genres 2","Singer 2", "05:00 min" ))
        songItemsList.add(SongItemModel("http://i.imgur.com/tGbaZCY.jpg","Song 3","Genres 3","Singer 3", "04:00 min" ))
        songItemsList.add(SongItemModel("http://i.imgur.com/tGbaZCY.jpg","Song 4","Genres 4","Singer 4", "06:00 min" ))
        songItemsList.add(SongItemModel("http://i.imgur.com/tGbaZCY.jpg","Song 5","Genres 5","Singer 5", "07:00 min" ))
        songItemsList.add(SongItemModel("http://i.imgur.com/tGbaZCY.jpg","Song 6","Genres 6","Singer 6", "08:00 min" ))
    }

    private fun initAdapter() {
        binding.apply {
        songItemRecyclerView.layoutManager = LinearLayoutManager(this@SongsListActivity,LinearLayoutManager.HORIZONTAL,false)
        songItemRecyclerView.adapter = SongItemsAdapter(this@SongsListActivity, songItemsList)
        }

//        binding.apply {
//            songItemRecyclerView.layoutManager = LinearLayoutManager(this@SongsListActivity,LinearLayoutManager.HORIZONTAL,false)
//            songItemRecyclerView.adapter = SongItemsAdapter(this@SongsListActivity, songItemsList)
//        }
    }
}