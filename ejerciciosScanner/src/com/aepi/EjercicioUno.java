package com.aepi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		System.out.println("LEER POR TECLADO 10 NÚMEROS Y DECIR SI ESTAN ORDENADOS DE FORMA CRECIENTE, DECRECIENTE O DESORDENADOS");
		
		Scanner sc = new Scanner(System.in);
		
		int[] lista = new int[10];
		boolean creciente= false, decreciente = false;
		int i;
		
		System.out.println("Por favor, escribe un numero entero: ");
		for(i = 0; i < 10; i++) {
			lista[i] = sc.nextInt();
		}
		
		// Hacemos el bucle hasta 9 porque sólo tenemos 10 valores guardados. Si hacemos 10 + 1, no existe por lo que nos dará error.
		// Esto es: primer número es mayor o menor que el 2º numero?
		for(i = 0; i < 9; i++){
			
			if(lista[i] > lista[i + 1] ) {
				
				decreciente = true;
				
			} else if(lista[i] < lista[i + 1] ) {
				
				creciente = true;
				
			}
			
			System.out.println("Lista i: " + lista[i] + " Lista i+1: " + lista[i+1]);
			
		}
		
		
		if(creciente == true && decreciente == false) { // Si todos los numeros son crecientes marca true a creciente
			
			System.out.println("La lista es creciente");
			
		}else if(creciente == false && decreciente == true) { // Si todos los numeros son decrecientes marca true a decreciente
			
			System.out.println("La lista es decreciente");
			
		}else if(creciente == true && decreciente == true) { // Si hay numeros qie son crecientes y decrecientes marca true a los dos
			
			System.out.println("La lista es desordenada");
			
		}else if(creciente == false && decreciente == false) { // Si no hay numeros que son crecientes y decrecientes (mayores que otros) deja false a los dos.
			
			System.out.println("Los numeros son iguales");
			
		}
		
	
		
		
		

	}

}
