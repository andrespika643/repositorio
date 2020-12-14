package pruebaGit;

import java.util.Scanner;

public class hola {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int nivelesCO2[][]= new int[5][0];
		for (int i=0;i<nivelesCO2.length;i++) {
			System.out.println("Introduzca el numero de medidas que se ha realizado en la "+ (i+1) +"ª semana");
			nivelesCO2[i]= new int[teclado.nextInt()];
			for(int n=0; n<nivelesCO2[i].length;n++) {
				System.out.println("Introduce todos los niveles de CO2 de esta semana");
				nivelesCO2[i][n]=teclado.nextInt();
			}
		}
		for (int i=0;i<nivelesCO2.length;i++) {
			for(int n=0; n<nivelesCO2[i].length;n++) {
				System.out.println("Medida " + (n+1) + ", de la semana " + (i+1) + ": " + nivelesCO2[i][n]);
			}
		}
		
	}
}
