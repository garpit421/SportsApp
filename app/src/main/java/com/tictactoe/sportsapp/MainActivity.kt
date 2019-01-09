package com.tictactoe.sportsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sportAdopter = SpoerAdopter(this@MainActivity)
        gridView.adapter = sportAdopter
    }
}
