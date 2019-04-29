package com.example.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var selectedSkill = ""
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_VALUE)
        println(league)
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

    }
}
