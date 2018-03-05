import static org.junit.Assert.*;

import org.junit.Test;

public class TiempoTest {

	Tiempo fecha1 = new Tiempo (2, 1, 20);
	@Test
	public void testSetSegundo() {
		fecha1.setSegundo(20);
		
		int resultadoReal = fecha1.getSegundo();
		
		int resultadoEsperado = 20;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testSetMinuto() {
		fecha1.setMinuto(1);
		
		int resultadoReal = fecha1.getMinuto();
		
		int resultadoEsperado = 1;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testSetHora() {
		fecha1.setHora(2);
		
		int resultadoReal = fecha1.getHora();
		
		int resultadoEsperado = 2;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testSiguienteSegundo() {
		fecha1.siguienteSegundo();
		
		int resultadoReal = fecha1.getSegundo();
		
		int resultadoEsperado = 21;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testSiguienteMinuto() {
		fecha1.siguienteMinuto();
		
		int resultadoReal = fecha1.getMinuto();
		
		int resultadoEsperado = 2;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testSiguienteHora() {
		fecha1.siguienteHora();
		
		int resultadoReal = fecha1.getHora();
		
		int resultadoEsperado = 3;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testAnteriorSegundo() {
		fecha1.anteriorSegundo();
		
		int resultadoReal = fecha1.getSegundo();
		
		int resultadoEsperado = 19;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testAnteriorMinuto() {
		fecha1.anteriorMinuto();
		
		int resultadoReal = fecha1.getMinuto();
		
		int resultadoEsperado = 0;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testAnteriorHora() {
		fecha1.anteriorHora();
		
		int resultadoReal = fecha1.getHora();
		
		int resultadoEsperado = 1;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

}
