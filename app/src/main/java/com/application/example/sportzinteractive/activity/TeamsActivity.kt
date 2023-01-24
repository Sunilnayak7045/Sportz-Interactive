package com.application.example.sportzinteractive.activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.application.example.sportzinteractive.R
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.RivalryApiResponseDataModel
import com.application.example.sportzinteractive.network.APIClient
import com.application.example.sportzinteractive.network.APIInterface
import com.application.example.sportzinteractive.repository.OponentRepository
import com.application.example.sportzinteractive.utils.startActivityUtils
import com.application.example.sportzinteractive.viewmodel.OponentViewModelFactory
import com.application.example.sportzinteractive.viewmodel.OponentViewmodel


class TeamsActivity : AppCompatActivity() {
    private lateinit var mainViewModel: OponentViewmodel
    private lateinit var match1Oponent1 : TextView
    private lateinit var match1Oponent2 : TextView
    private lateinit var match1Status : TextView
    private lateinit var winningTeam : TextView
    private lateinit var teamsCardView : CardView
//    private  var teeamsList : ArrayList<RivalryApiResponseDataModel>? = null
    private  var teeamsList : RivalryApiResponseDataModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teams)


        Init()

        val rivalryOponentService = APIClient.getInstance().create(APIInterface::class.java)
        val repository = OponentRepository(rivalryOponentService)
        mainViewModel= ViewModelProvider(this, OponentViewModelFactory(repository)).get(OponentViewmodel::class.java)

        mainViewModel.rivalryOponent.observe(this, Observer {
            match1Oponent1.setText( it.Teams?.Oponent6?.NameFull)
            match1Oponent2.setText( it.Teams?.Oponent7?.NameFull)
            match1Status.setText(  it.Matchdetail?.Status)
            winningTeam.setText( it.Matchdetail?.Result)
            teeamsList = it
        })

        teamsCardView.setOnClickListener {
            val intent: Intent = Intent(this,TeamsDetailsActivity::class.java).apply {
                this.putExtra("teams_List",teeamsList)
            }

            startActivity(intent)


        }
    }

    private fun Init() {
        match1Oponent1 = findViewById(R.id.ll_oponent1)
        match1Oponent2 = findViewById(R.id.ll_oponent2)
        match1Status = findViewById(R.id.ll_matchStatus)
        winningTeam = findViewById(R.id.ll_winningTeam)
        teamsCardView = findViewById(R.id.cv_match1)
    }

}