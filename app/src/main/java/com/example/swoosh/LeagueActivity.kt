package com.example.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun mensOnClicked(view: View) {
        womensLeagueButt.isChecked = false
        coEdLeagueButt.isChecked = false

        selectedLeague = "mens"
    }

    fun womensOnClicked(view: View) {
        mensLeagueButt.isChecked = false
        coEdLeagueButt.isChecked = false

        selectedLeague = "womens"
    }

    fun coEdOnClicked(view: View) {
        mensLeagueButt.isChecked = false
        womensLeagueButt.isChecked = false

        selectedLeague = "co-ed"
    }

    fun leagueNextClicked(view : View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this,SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_VALUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this,"Please select league to begin.", Toast.LENGTH_SHORT).show()
        }
    }
}
