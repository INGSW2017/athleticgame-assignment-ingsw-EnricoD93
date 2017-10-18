package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	static AthleticGame a;

	@BeforeClass
	public static void init() {
		a=new AthleticGame("tennis");
		a.addArrival("Enrico", Instant.now().plusMillis(1000));
		a.addArrival("Luca", Instant.now().plusMillis(1500));
	}
	
	@After
	public void reset() {
		a.reset();
	}
	
	 @Before
	 public void start() {
		 a.start();
	 }
	 
	 @Test
	 public void getWinnerTest1() {
		 Assert.assertEquals("Enrico",a.getWinner());
	 }
	 
	 @Test
	 public void getWinnerTest2() {
		 Assert.assertEquals(null, a.getWinner());
	 }
}
