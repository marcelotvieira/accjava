package com.example.planejamentoeventos;

import java.time.LocalDate;
import java.time.LocalTime;

public class PlanejamentoEventos {
	
	LocalDate dataEvento;
	LocalTime horaEvento;
	
	public void agendarEvento(String data, String hora) {
		dataEvento = LocalDate.parse(data);
		horaEvento = LocalTime.parse(hora);
	}
	
	public void checarEvento() {
		LocalDate dataAgora = LocalDate.now();
		LocalTime horaAgora = LocalTime.now();
		
		if(dataAgora.equals(dataEvento)) {
			System.out.println("O evento é hoje");
			if (horaAgora.isAfter(horaEvento)) {
				System.out.println("Você ja está atrasado, já passou do inicio do evento");
			} else {
				System.out.println("Se arrume que da tempo!");
			}
		} else {
			System.out.println("O evento não é hoje!");
		}
	}

}
