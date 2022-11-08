package com.example.musicplayer

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicplayer.databinding.MenuViewBinding

class MusicAdapter(private val context: Context,private val musicList: ArrayList<Music>) : RecyclerView.Adapter<MusicAdapter.MyHolder>() {
    class MyHolder (binding : MenuViewBinding): RecyclerView.ViewHolder(binding.root){

        val title = binding.songNameMV
        val album = binding.songAlbumMV
        val image =binding.imageMV
        val duration = binding.songDuration
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(MenuViewBinding.inflate(LayoutInflater.from(context),parent,false))   }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.title.text = musicList[position].title
        holder.album.text = musicList[position].album
        holder.duration.text = musicList[position].duration.toString()
    }

    override fun getItemCount(): Int {
        return musicList.size    }
}