package com.example.planejamentoeventos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PlanejamentoEventos {
	
	LocalDate dataEvento;
	LocalTime horaEvento;
	String dateFormat = "dd/MM/yyyy";
	DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern(dateFormat);
	
	public void agendarEvento(String data, String hora) {
		dataEvento = LocalDate.parse(data);
		horaEvento = LocalTime.parse(hora);
	}
	
	public void checarEvento() {
		LocalDate dataAgora = LocalDate.now();
		LocalTime horaAgora = LocalTime.now();
		
		if(dataAgora.equals(dataEvento)) {
			System.out.println("O evento é hoje");
			System.out.println(formatadorData.format(dataEvento) + " as " + horaEvento);
			if (horaAgora.isAfter(horaEvento)) {
				System.out.println("Você ja está atrasado, já passou do inicio do evento");
				System.out.println(formatadorData.format(dataEvento) + " as " + horaEvento);
			} else {
				System.out.println("Se arrume que da tempo!");
				System.out.println(formatadorData.format(dataEvento) + " as " + horaEvento);
			}
		} else {
			System.out.println("O evento não é hoje!");
			System.out.println(formatadorData.format(dataEvento) + " as " + horaEvento);
		}
	}

}
