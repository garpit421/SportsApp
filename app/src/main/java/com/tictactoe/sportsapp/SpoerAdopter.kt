package com.tictactoe.sportsapp

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.sport_item.view.*

class SpoerAdopter : BaseAdapter{

	override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
		var sport: Sport = sportDatabase?.sports?.get(position) ?: Sport("No Name","No Detail",
			R.drawable.placeholder)
		var inflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
		var sportItem = inflater.inflate(R.layout.sport_item,null)
		sportItem.sportImages.setImageResource(sport.sportImages ?: R.drawable.placeholder)
		sportItem.sportName.setText(sport.sportName)


		sportItem.setOnClickListener{

			val detailIntent = Intent(context,SportDetailActivity::class.java)
			detailIntent.putExtra("image",sport.sportImages)
			detailIntent.putExtra("detail",sport.sportDetail)
			ContextCompat.startActivities(context!!, arrayOf(detailIntent),null)
		}

		return sportItem

	}

	override fun getItem(position: Int): Any {
		return sportDatabase?.sports?.get(position) ?: Sport("No Name","No Detail",R.drawable.placeholder)

	}

	override fun getItemId(position: Int): Long {
		return position.toLong()

	}

	override fun getCount(): Int {
		return sportDatabase?.sports?.size ?: 0
	}

	private var sportDatabase: SportDatabase? = null
	private var context: Context? = null

	constructor(context: Context){
		this.context = context
		sportDatabase = SportDatabase()
	}

}