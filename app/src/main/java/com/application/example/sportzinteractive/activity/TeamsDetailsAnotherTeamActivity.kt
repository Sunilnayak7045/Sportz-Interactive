package com.application.example.sportzinteractive.activity

import android.app.Dialog
import android.os.Bundle
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.example.sportzinteractive.R
import com.application.example.sportzinteractive.adapter.PlayersNameAdapter
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.*

class TeamsDetailsAnotherTeamActivity : AppCompatActivity() {

    lateinit var filterImage : ImageView
    lateinit var  adapter : PlayersNameAdapter

    @RequiresApi(33)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teams_details)
        val mPlayerListOpponent1 = mutableListOf<String>()
        val mPlayerListOpponent2 = mutableListOf<String>()

        Init()

        val teamPlayerData = intent?.extras?.getParcelable<RivalryApiResponseDataModel>("teams_List_Another_Match")

        val recyclerview = findViewById<RecyclerView>(R.id.rv_oponent1)

        recyclerview.layoutManager = LinearLayoutManager(this)



        teamPlayerData?.Teams?.Oponent4?.NameFull!!.let { mPlayerListOpponent1.add(it) }
        teamPlayerData.Teams?.Oponent4?.Players1!!.OponentData3667?.NameFull?.let { mPlayerListOpponent1.add(it) }
        teamPlayerData.Teams?.Oponent4?.Players1!!.OponentData4356?.NameFull?.let { mPlayerListOpponent1.add(it) }
        teamPlayerData.Teams?.Oponent4?.Players1!!.OponentData5313?.NameFull?.let { mPlayerListOpponent1.add(it) }
        teamPlayerData.Teams?.Oponent4?.Players1!!.OponentData12518?.NameFull?.let { mPlayerListOpponent1.add(it) }
        teamPlayerData.Teams?.Oponent4?.Players1!!.OponentData24669?.NameFull?.let { mPlayerListOpponent1.add(it) }
        teamPlayerData.Teams?.Oponent4?.Players1!!.OponentData28891?.NameFull?.let { mPlayerListOpponent1.add(it) }
        teamPlayerData.Teams?.Oponent4?.Players1!!.OponentData48191?.NameFull?.let { mPlayerListOpponent1.add(it) }
        teamPlayerData.Teams?.Oponent4?.Players1!!.OponentData57458?.NameFull?.let { mPlayerListOpponent1.add(it) }
        teamPlayerData.Teams?.Oponent4?.Players1!!.OponentData59736?.NameFull?.let { mPlayerListOpponent1.add(it) }
        teamPlayerData.Teams?.Oponent4?.Players1!!.OponentData63611?.NameFull?.let { mPlayerListOpponent1.add(it) }
        teamPlayerData.Teams?.Oponent4?.Players1!!.OponentData64221?.NameFull?.let { mPlayerListOpponent1.add(it) }

        teamPlayerData.Teams?.Oponent5?.NameFull!!.let { mPlayerListOpponent2.add(it) }
        teamPlayerData.Teams?.Oponent5?.Players1!!.OponentData3667?.NameFull?.let { mPlayerListOpponent2.add(it) }
        teamPlayerData.Teams?.Oponent5?.Players1!!.OponentData4356?.NameFull?.let { mPlayerListOpponent2.add(it) }
        teamPlayerData.Teams?.Oponent5?.Players1!!.OponentData5313?.NameFull?.let { mPlayerListOpponent2.add(it) }
        teamPlayerData.Teams?.Oponent5?.Players1!!.OponentData12518?.NameFull?.let { mPlayerListOpponent2.add(it) }
        teamPlayerData.Teams?.Oponent5?.Players1!!.OponentData24669?.NameFull?.let { mPlayerListOpponent2.add(it) }
        teamPlayerData.Teams?.Oponent5?.Players1!!.OponentData28891?.NameFull?.let { mPlayerListOpponent2.add(it) }
        teamPlayerData.Teams?.Oponent5?.Players1!!.OponentData48191?.NameFull?.let { mPlayerListOpponent2.add(it) }
        teamPlayerData.Teams?.Oponent5?.Players1!!.OponentData57458?.NameFull?.let { mPlayerListOpponent2.add(it) }
        teamPlayerData.Teams?.Oponent5?.Players1!!.OponentData59736?.NameFull?.let { mPlayerListOpponent2.add(it) }
        teamPlayerData.Teams?.Oponent5?.Players1!!.OponentData63611?.NameFull?.let { mPlayerListOpponent2.add(it) }
        teamPlayerData.Teams?.Oponent5?.Players1!!.OponentData64221?.NameFull?.let { mPlayerListOpponent2.add(it) }



         adapter = PlayersNameAdapter( this ,mPlayerListOpponent1 ,mPlayerListOpponent2 )
        recyclerview.adapter = adapter

    }


    private fun Init() {
        filterImage = findViewById(R.id.ll_filter_image)
    }
}