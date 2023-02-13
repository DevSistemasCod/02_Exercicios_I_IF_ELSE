package exercicios;

import java.util.Scanner;

public class VerificaSeIguaisDif {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		int valor1, valor2, resutado;
		
		System.out.print("Digite o valor1: ");
		valor1 = entrada1.nextInt();
		
		System.out.print("Digite o valor2: ");
		valor2 = entrada2.nextInt();
	
		if (valor1 == valor2) {
			System.out.println("Valores são iguais");
		} 
		else {
			System.out.println("Valores são diferentes");
		}
		
		resutado = (valor1 + valor2)*2;
		
		if(resutado > 10) {
			System.out.println("RESULTADO FINAL MAIOR DO QUE 10");
		}
		else if(resutado < 10) {
			System.out.println("RESULTADO FINAL MENOR DO QUE 10");
		} 
		else{
			System.out.println("RESULTADO FINAL É 10");
		}
		
		entrada1.close();
		entrada2.close();
	}

}
