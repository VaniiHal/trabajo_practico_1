package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num=0;
		Scanner entrada = new Scanner(System.in);
		while (num<5 || num>10) {
			System.out.print("Ingresa un numero entre 5 y 10: ");
			num=entrada.nextInt();
		}
		String nombres[] = new String[num];
		for(int k=0;k<num;k++) {
			System.out.print("Ingrese un nombre de persona: ");
			nombres[k]=entrada.next();
		}
		for(int k=0;k<num;k++) {
			System.out.println("Indice: " + k + "\tValor del indice: " + nombres[k]);
		}
		entrada.close();
	}

}
