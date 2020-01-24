package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public class smokeTest {
	
	// Prueba anaidir 120segundos a la fecha
	@Test
	public void fechaMasCientoVeinteSegundos() {
		final LocalDateTime localDateTime = LocalDateTime.of(2020,01,01,00,00,00);
		final long seconds = 120;
		//final LocalDateTime localDateTimeexpected = LocalDateTime.of(2020,01,01,00,02,00);
		final String localDateTimeExpected = "2020/01/01 00:02:00";
		final Time time = new Time(localDateTime);
		assertEquals(localDateTimeExpected, time.getFutureTime(seconds));
	}
	
	
	// Prueba numero de invocaciones getFutureTime
	@Test
	public void unaInvocacionFutureTime() {
		final Time mock = mock(Time.class);
		final MyClass myClass = new MyClass(mock);
		final long seconds = 60;
		myClass.nextTime(seconds);
		verify(time, times(1)).getFutureTime(seconds);
	}
}