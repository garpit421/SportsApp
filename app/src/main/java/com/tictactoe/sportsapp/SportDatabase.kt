package com.tictactoe.sportsapp

class SportDatabase {

	var sports: ArrayList<Sport>? = null

	constructor(){
		sports = ArrayList()

		sports?.add(
			Sport("Boxing","Boxing is a combat sport in which two people" +
				"usually wearing protective gloves" +
				"throw punches at each other for a predetermined set of time" +
				"in a boxing ring",R.drawable.boxing)
		)
		sports?.add(Sport("Cycling"," Cycling, also called biking or bicycling, " +
				"is the use of bicycles for transport, recreation, exercise or sport." +
				" People engaged in cycling are referred to as " +
				"cyclists, bikers, or less commonly, as bicyclists",R.drawable.cycling))

		sports?.add(Sport("Racing","In sport, racing is a competition of speed," +
				" against an objective criterion, usually a clock or to a specific point." +
				" The competitors in a race try to complete a given task in the " +
				"shortest amount of time",R.drawable.racing))

		sports?.add(Sport("Football","Association football, more commonly known as " +
				"football or soccer, is a team sport played with a spherical ball between " +
				"two teams of eleven players. It is played by 250 million players in over " +
				"200 countries and dependencies, making it the world's most popular sport",R.drawable.socar))
		sports?.add(Sport("Surfing","Water surfing is one of the most thrilling and exciting water sports," +
				" which has new experiences in store every time one rides the waves. ..." +
				" Water surfing has caught the fancy of many people with some being a natural at this sport;" +
				" while others strive meticulously to perfect their stance on the surfboard.",R.drawable.surfing))
		sports?.add(Sport("skating","Ice skates are boots with blades attached to the bottom," +
				" used to propel the bearer across a sheet of ice while ice skating." +
				" The first ice skates were made from leg bones of horse, ox or deer," +
				" and were attached to feet with leather straps.",R.drawable.skating))
		sports?.add(Sport("Skate boarding","Skateboarding is an action sport" +
				" which involves riding and performing tricks using a skateboard," +
				" as well as a recreational activity, an art form, an entertainment industry job," +
				" and a method of transportation. Skateboarding has been shaped and" +
				" influenced by many skateboarders throughout the years",R.drawable.boarding))
	}
}