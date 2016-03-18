package de.nemeth.langame

import org.junit.Before;
import org.junit.Test;

class BoardTest {
	private Board board

	@Before
	public void setUp() {
		board = new Board()
	}

	@Test
	public void addPlayer() {
		Player newPlayer = new Player()
		board.addPlayer(newPlayer)

		assert board.players == [newPlayer]
	}
	
	@Test
	public void boardDefaults() {
		assert board.dimension == new Dimension(x: 30, y: 20)
	}
}
