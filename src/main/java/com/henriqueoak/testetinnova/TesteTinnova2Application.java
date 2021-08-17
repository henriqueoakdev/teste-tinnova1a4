package com.henriqueoak.testetinnova;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteTinnova2Application {

	public static void main(String[] args) {
		SpringApplication.run(TesteTinnova2Application.class, args);

		int[] v = new int[8];

		v[0] = 5;
		v[1] = 3;
		v[2] = 2;
		v[3] = 4;
		v[4] = 7;
		v[5] = 1;
		v[6] = 0;
		v[7] = 6;
		
		for(int i=0; i<v.length; i++) {
			for(int j=i+1; j<v.length; j++) {
				if(v[i] > v[j]) {
					int aux = 0;
					
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		
		System.out.println(Arrays.toString(v));
	}
}
