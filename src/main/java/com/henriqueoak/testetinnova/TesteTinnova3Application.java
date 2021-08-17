package com.henriqueoak.testetinnova;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteTinnova3Application {

	public static void main(String[] args) {
		SpringApplication.run(TesteTinnova3Application.class, args);
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número para o qual deve-se calcular o fatorial: ");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.println("O fatorial do número inserido é: " + calculoFatorial(num));
	}
	
	public static int calculoFatorial(int num) {
		int fatorial = num;
		
		if(num == 0 || num == 1) {
			fatorial = 1;
		} else {
			for(int i=num; i>1; i--) {
				fatorial *= i-1;
			}
		}
		
		return fatorial;
	}
}
