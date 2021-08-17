package com.henriqueoak.testetinnova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.henriqueoak.classes.Votos;

@SpringBootApplication
public class TesteTinnova1Application {

	public static void main(String[] args) {
		SpringApplication.run(TesteTinnova1Application.class, args);
		
		Votos votos = new Votos();
		double votosValidos = 800, votosBrancos = 150, votosNulos = 50;
		
		System.out.println("Percentual relativo de votos válidos:" + votos.calculoRelativo(votosValidos) + "%");
		System.out.println("Percentual relativo de votos válidos:" + votos.calculoRelativo(votosBrancos) + "%");
		System.out.println("Percentual relativo de votos válidos:" + votos.calculoRelativo(votosNulos) + "%");
	}

}
