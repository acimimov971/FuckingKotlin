package com.example.fuckingkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandNumber()
    }

    companion object {

        const val TOTAL_COUNT = "total_count"

    }

    fun showRandNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        textView2.text = getString(R.string.TitleRand, count)
        val rnd = Random()
        var randInt = 0
        if (count > 0) {
            randInt = rnd.nextInt(count + 1)
        }
        textView3.text = randInt.toString()
    }
}
