package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.Utils.EXTRA_LEAGUE
import com.example.swoosh.Utils.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var selectedSkill = ""
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        selectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBegginerClicked(view: View) {
        ballerSkillButt.isChecked = false
        selectedSkill = "begginer"
    }

    fun onBallerClicked(view: View) {
        begginerSkillButt.isChecked = false
        selectedSkill = "baller"
    }

    fun finishButtClicked(view: View) {
        if (selectedSkill != "") {
            var finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            finishActivity.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Please a skill level",Toast.LENGTH_SHORT).show()
        }

    }
}
