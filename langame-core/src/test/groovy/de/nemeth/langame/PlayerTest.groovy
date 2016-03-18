package de.nemeth.langame

import org.junit.Before;
import org.junit.Test;

class PlayerTest {

	private static final String PLAYER_NAME = 'Hanz'
	private def player
	
	@Before
	public void setUp() {
		player = new Player(name: PLAYER_NAME)
	}

	@Test
	public void hasName() {
		assert player.name == PLAYER_NAME
	}

}
