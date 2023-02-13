package exercicios;

import java.util.Scanner;
public class MaiorIdade2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, resto;
			
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
			
		resto = numero % 2;
					
		if (resto == 0) {
			System.out.print("O número é par");
		}else {
			System.out.print("O número é ímpar");
		}
		entrada.close();
		
	}

}
