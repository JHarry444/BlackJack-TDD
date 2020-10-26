package com.qa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackJackTest {

	@Test // flags as a test
	public void testP1Wins() {
		// error msg EXPECTED ACTUAL
		assertEquals("Player 1 has not won", 21, BlackJack.play(21, 18));
	}

	@Test
	public void testP2Wins() {
		assertEquals("Player 2 has not won", 21, BlackJack.play(18, 21));

	}

	@Test
	public void testP1Bust() {
		assertEquals("Player 1 has not won", 16, BlackJack.play(30, 16));
	}

	@Test
	public void testP2Bust() {
		assertEquals("Player 2 has not won", 16, BlackJack.play(16, 30));

	}

	@Test
	public void testDraw() {
		assertEquals("Draw not returned 0", 0, BlackJack.play(16, 16));
	}

	@Test
	public void testBothBust() {
		assertEquals(0, BlackJack.play(30, 30));
	}
}
