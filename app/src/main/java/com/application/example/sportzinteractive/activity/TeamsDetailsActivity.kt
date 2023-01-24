package com.application.example.sportzinteractive.activity

import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.example.sportzinteractive.R
import com.application.example.sportzinteractive.adapter.PlayersNameAdapter
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.Players
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.RivalryApiResponseDataModel

class TeamsDetailsActivity : AppCompatActivity() {


    @RequiresApi(33)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teams_details)


        val teamPlayerData = intent?.extras?.getParcelable<RivalryApiResponseDataModel>("teams_List")

        Toast.makeText(this, teamPlayerData.toString(), Toast.LENGTH_LONG).show()



        val recyclerview = findViewById<RecyclerView>(R.id.rv_oponent1)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val adapter = PlayersNameAdapter(
            teamPlayerData?.Teams?.Oponent6?.Players!!  ,
            teamPlayerData.Teams?.Oponent7?.Players!! )

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}