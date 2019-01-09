package com.tictactoe.sportsapp

class Sport {

	var sportName: String? = null
	var sportDetail: String? = null
	var sportImages: Int? = null

	constructor(name: String,detail: String, image: Int) {
		sportName = name
		sportDetail = detail
		sportImages = image
	}
}