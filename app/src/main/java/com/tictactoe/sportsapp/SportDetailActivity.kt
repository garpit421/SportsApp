package com.tictactoe.sportsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sport_detail.*

class SportDetailActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_sport_detail)

		val receiveData = intent.extras

		val sportImage = receiveData.getInt("image")
		val sportDetail = receiveData.getString("detail")

		detailImage.setImageResource(sportImage)
		detailText.text = sportDetail
	}
}
