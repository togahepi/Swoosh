package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun mensOnClicked(view: View) {
        womensLeagueButt.isChecked = false
        coEdLeagueButt.isChecked = false

        player.league = "mens"
    }

    fun womensOnClicked(view: View) {
        mensLeagueButt.isChecked = false
        coEdLeagueButt.isChecked = false

        player.league = "womens"
    }

    fun coEdOnClicked(view: View) {
        mensLeagueButt.isChecked = false
        womensLeagueButt.isChecked = false

        player.league = "co-ed"
    }

    fun leagueNextClicked(view : View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this,"Please select league to begin.", Toast.LENGTH_SHORT).show()
        }
    }
}
