package com.aepi;

import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		System.out.println("Leer 5 elementos numéricos que se introducirán ordenados de\n"
				+ "forma creciente. Éstos los guardaremos en una\n"
				+ "tabla de tamaño 10. Leer un número N, e insertarlo en el lugar\n"
				+ "adecuado para que la tabla continúe ordenada.");
		
		Scanner sc = new Scanner(System.in);
		int matriz[] = new int[10];
		
		int num;
		
		System.out.println("\nPor favor, escribe 5 números de manera creciente: ");
		for(int i= 0; i<5; i++) {
			matriz[i] = sc.nextInt();
		}
		
		System.out.println("Por favor intruce otro número para insertar en la lista anterior: ");
		num = sc.nextInt();
		
		int lugar = 0;
		int j = 0;
		
		
		// Sacamos el valor del lugar donde debe ir el numero y pintamos.
		while(matriz[j] < num && j <= 5) {
			lugar++;
			j++;
		}
		System.out.print("\nLugar vale = " + lugar);
		
		
		
		// Desplazamos todos los números una posición desde el valor de lugar y pintamos.
		for(int i = 5; i >= lugar; i--){		
			matriz[i + 1] = matriz[i];	
		}
		System.out.println("\n\nLa misma matriz con los números desplazados:");
		for(int i = 0; i < 6; i++) {
			System.out.print(matriz[i]);
		}
		
		
		// Añadimos el número a su lugar y pintamos
		matriz[lugar] = num;
		
		System.out.println("\n\nLa matriz ahora es: ");
		for(int i = 0; i < 6; i++) {
			System.out.print(matriz[i]);
		}

	}

}
