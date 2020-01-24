package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	private LocalDateTime localDateTime;
	
	public Time(LocalDateTime localDateTime){
		this.localDateTime = localDateTime;
	}
	
	public String getFutureTime(long seconds) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		localDateTime.plusSeconds(seconds);
		return formatter.format(localDateTime);	
	}
}