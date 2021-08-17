package com.henriqueoak.testetinnova;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteTinnova4Application {

	public static void main(String[] args) {
		SpringApplication.run(TesteTinnova4Application.class, args);
		
		int num = 0, total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número limite: ");
		num = Integer.parseInt(sc.nextLine());
		
		for(int i=num; i>1; i--) {
			if(i % 3 == 0 || i % 5 == 0) {
				total += i;
			}
		}
		
		System.out.println("A soma dos números naturais múltiplos de 3 e 5 até o número limite é: " + total);
	}
}
