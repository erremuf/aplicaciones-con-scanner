package com.aepi;

import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		System.out.println("Diseñar una aplicación que declare una tabla de 10 elementos\n"
				+ "enteros. Leer mediante el teclado 8 números.\n"
				+ "Después se debe pedir un número y una posición, insertarlo en la\n"
				+ "posición indicada, desplazando los que estén\n"
				+ "detrás.\n\n");
		
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int [10];
		int num;
		int posicion;
		
		System.out.println("Introduce 8 números: ");
		for(int i = 0; i<8; i++) {
			tabla[i] = sc.nextInt();
		}
		
		System.out.println("\nAhora la matriz es: ");
		for(int i = 0; i<8; i++) {
			System.out.print(tabla[i]);
		}
		
		System.out.println("\nAhora introduce un número: ");
		num = sc.nextInt();
		System.out.println("\nY, por último, introduce la posición de 0 a 8: ");
		posicion = sc.nextInt();
		
		
		
		
		/* 
		   BUCLE: 
		   Tenemos 8 números por lo que no podemos pasar de 8 (i+1 nos llegaría a dar la posición 9 y fallaría porque no existe aun.
		   
		   Imaginemos que tenemos un array que es 12345678 y queremos poner un 9 en la posición 0 
		   En este caso, el bucle dice: ¿7 es mayor o igual que 0? Si, asi que la posicion 7 + 1, osea, la posición 8, que es 8 en este caso, ahora vale 7. 
		   Restamos uno a i(7). Ahora vale 6. ¿6 es >= 0? Si, por lo que la posicion 6+1, osea, la 7, que es 7 en este caso, ahora vale 6
		   Restamos uno a i(6). Ahora vale 5.... y así sucesivamente vamos moviendo un número tras otro hasta llegar a la posición que necesitamos, salimos del bucle
		   y decimos la posicion y el valor. 
		   SI NO HACEMOS ESTE BUCLE, PONDRÍAMOS EL NUMERO EN LA POSICIÓN QUE QUEREMOS PERO NO CONSEGUIRÍAMOS DESPLAZAR LOS DEMÁS.
		*/
		for(int i=7; i>=posicion; i--) {
			tabla[i+1] = tabla[i];
		}
		tabla[posicion] = num;
		
		
		System.out.println("\nAhora la matriz es: ");
		// Si en este bucle ponemos 10 rondas en vez de 9, no añadirá un 0 al final ya que tenemos sólo 9 numeros en la matriz.
		for(int i = 0; i<9; i++) {
			System.out.print(tabla[i]);
		}
		

	}

}
