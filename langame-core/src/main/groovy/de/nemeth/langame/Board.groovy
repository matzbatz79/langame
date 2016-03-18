package de.nemeth.langame

import groovy.transform.Immutable

@Immutable
class Board {
	private final Dimension dimension = BoardDefaults.DEFAULT_DIMENSION
	private final def players = []
	
	void addPlayer( Player newPlayer ) {
		players << newPlayer
	}
}
