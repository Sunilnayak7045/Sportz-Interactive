package com.application.example.sportzinteractive.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.application.example.sportzinteractive.R
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.*
import com.application.example.sportzinteractive.utils.Constants.Companion.numberOfPlayer

class PlayersNameAnotherTeamAdapter(
    private val context : Context,
    private val mOponentList1: MutableList<String>,
    private val mOponentList2: MutableList<String> ) :
    RecyclerView.Adapter<PlayersNameAnotherTeamAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_team_player_name, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        if(position==0){
            val bgTeamTitleColor = ContextCompat.getColor(holder.playersNameTextView1.context, R.color.light_grey)
            holder.playersNameTextView1.setBackgroundColor(bgTeamTitleColor)
            holder.playersNameTextView2.setBackgroundColor(bgTeamTitleColor)
        }
        holder.playersNameTextView1.text = mOponentList1[position]
        holder.playersNameTextView2.text = mOponentList2[position]


    }

    override fun getItemCount(): Int {
        return mOponentList1.size-1
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val playersNameTextView1: TextView = itemView.findViewById(R.id.tv_playersname1)
        val playersNameTextView2: TextView = itemView.findViewById(R.id.tv_playersname2)
    }

}