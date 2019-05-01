package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBegginerClicked(view: View) {
        ballerSkillButt.isChecked = false
        player.skill = "begginer"
    }

    fun onBallerClicked(view: View) {
        begginerSkillButt.isChecked = false
        player.skill = "baller"
    }

    fun finishButtClicked(view: View) {
        if (player.skill != "") {
            var finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Please a skill level",Toast.LENGTH_SHORT).show()
        }

    }
}
