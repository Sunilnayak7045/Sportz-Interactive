package com.application.example.sportzinteractive.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.application.example.sportzinteractive.R
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.*
import com.application.example.sportzinteractive.utils.Constants.Companion.numberOfPlayer
import com.google.gson.annotations.SerializedName

class PlayersNameAdapter(private val mOponentList1: Players, mOponentList2: Players ) :
    RecyclerView.Adapter<PlayersNameAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_team_player_name, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.playersNameTextView.text = mOponentList1.OponentData3667?.NameFull
        holder.playersNameTextView.text = mOponentList1.OponentData4356?.NameFull
        holder.playersNameTextView.text = mOponentList1.OponentData5313?.NameFull
        holder.playersNameTextView.text = mOponentList1.OponentData12518?.NameFull
        holder.playersNameTextView.text = mOponentList1.OponentData24669?.NameFull
        holder.playersNameTextView.text = mOponentList1.OponentData28891?.NameFull
        holder.playersNameTextView.text = mOponentList1.OponentData48191?.NameFull
        holder.playersNameTextView.text = mOponentList1.OponentData57458?.NameFull
        holder.playersNameTextView.text = mOponentList1.OponentData59736?.NameFull
        holder.playersNameTextView.text = mOponentList1.OponentData63611?.NameFull
        holder.playersNameTextView.text = mOponentList1.OponentData64221?.NameFull


    }

    override fun getItemCount(): Int {
        return numberOfPlayer
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val playersNameTextView: TextView = itemView.findViewById(R.id.tv_playersname)
    }
}