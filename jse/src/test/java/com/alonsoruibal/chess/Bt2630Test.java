package com.alonsoruibal.chess;

public class Bt2630Test extends EpdTest {

	public void testBT2630() {
		long time = processEpdFile(this.getClass().getResourceAsStream("/bt2630.epd"), 15 * 60000);
		double timeSeconds = time / 1000;
		double elo = 2630 - (timeSeconds / 30);
		System.out.println("BT2630 Elo = " + elo);
	}

}