package examen;

import java.util.Scanner;

public class Numero_Primo {

	public static void main(String[] args) {
		int numero=0;
		int contador=0;
		String divisor="";
		String primo= "";
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Buenos días Ceinmark, soy Ángel Rivas \n" + "Introduce un número para averiguar si es primo o no:");
		numero= ent.nextInt();
		primo="Los divisores del " + numero + " son: 1 ";
		for(int i=2;i<numero;i++) {
			if(numero%i==0) {
				divisor=String.valueOf(i);
				primo = primo.concat(divisor);
				contador++;
			}
			
			}
		if(contador!=0) {
			System.out.println("El " + numero + " no es primo" + "\n" + primo);
		}else {
			System.out.println(numero + "es primo");
		}
	}

}
