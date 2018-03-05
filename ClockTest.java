import static org.junit.Assert.*;

import org.junit.Test;

public class ClockTest {

	Clock prueba = new Clock();
	@Test
	public void testStart() {
		
		long timeStart = 10;
		long resultado= prueba.start(timeStart);
		assertEquals(timeStart, resultado);
		
	}

	@Test
	public void testStop() {
		long timeStop = 20;
		long resultado= prueba.stop(timeStop);
		assertEquals(timeStop, resultado);
	}

	@Test
	public void testTimeElapsed() {
		long timeStart = 10;
		long timeStop = 20;
		long timeFinal = 10;
		long resultado= prueba.timeElapsed(timeStop,timeStart);
		assertEquals(timeFinal, resultado);
	}

}
