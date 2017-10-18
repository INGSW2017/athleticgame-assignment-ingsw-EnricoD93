package it.unical.test;

import static org.junit.Assert.assertEquals;

import java.time.Instant;

import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	static AthleticGame a = new AthleticGame("pallavolo");

	@Test
	public void addArrivalTest() {
		a.addArrival("Enrico", Instant.now());
		assertEquals(1, a.getArrivals().size());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getPartecipantTimeTest() {
		a.getParecipiantTime("Luca");
	}
}
