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
    private lateinit var teamTime : TextView
    private lateinit var teamDate : TextView
    private lateinit var teamsCardView : CardView
    private  var teamsListMatch2 : RivalryApiResponseDataModel? = null
    private lateinit var match2CardView : CardView
    private lateinit var teamDate2: TextView
    private lateinit var teamTime2 : TextView
    private lateinit var oponent1Team1 : TextView
    private lateinit var oponent2Team2 : TextView
    private lateinit var matchStatus2 : TextView
    private lateinit var winningTeam2 : TextView
    private  var teamsListMatch1 : RivalryApiResponseDataModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teams)


        Init()

        val rivalryOponentService = APIClient.getInstance().create(APIInterface::class.java)
        val repository = OponentRepository(rivalryOponentService)
        mainViewModel= ViewModelProvider(this, OponentViewModelFactory(repository))
            .get(OponentViewmodel::class.java)

        mainViewModel.rivalryOponent.observe(this, Observer {
            match1Oponent1.setText( it.Teams?.Oponent6?.NameFull)
            match1Oponent2.setText( it.Teams?.Oponent7?.NameFull)
            match1Status.setText(  it.Matchdetail?.Status)
            winningTeam.setText( it.Matchdetail?.Result)
            teamTime.setText( it.Matchdetail?.Match?.Time)
            teamDate.setText( it.Matchdetail?.Match?.Date)
            teamsListMatch1 = it
        })

        mainViewModel.rivalryOponentOfAnotherMatch.observe(this, Observer {

            oponent1Team1.setText( it.Teams?.Oponent4?.NameFull)
            oponent2Team2.setText( it.Teams?.Oponent5?.NameFull)
            matchStatus2.setText(  it.Matchdetail?.Status)
            winningTeam2.setText( it.Matchdetail?.Result)
            teamTime2.setText( it.Matchdetail?.Match?.Time)
            teamDate2.setText( it.Matchdetail?.Match?.Date)
            teamsListMatch2 = it
        })

        teamsCardView.setOnClickListener {
            val intent: Intent = Intent(this,TeamsDetailsActivity::class.java).apply {
                this.putExtra("teams_List",teamsListMatch1)
            }
            startActivity(intent)
        }

        match2CardView.setOnClickListener {
            val intent: Intent = Intent(this,TeamsDetailsAnotherTeamActivity::class.java).apply {
                this.putExtra("teams_List_Another_Match",teamsListMatch2)
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
        teamTime = findViewById(R.id.ll_team_time)
        teamDate = findViewById(R.id.ll_team_date)
        match2CardView = findViewById(R.id.cv_match2)
        teamDate2 = findViewById(R.id.ll_team_date2)
        teamTime2 = findViewById(R.id.ll_team_time2)
        oponent1Team1 = findViewById(R.id.ll_oponent1_team1)
        oponent2Team2 = findViewById(R.id.ll_oponent2_team2)
        matchStatus2 = findViewById(R.id.ll_matchStatus2)
        winningTeam2 = findViewById(R.id.ll_winningTeam2)
    }

}