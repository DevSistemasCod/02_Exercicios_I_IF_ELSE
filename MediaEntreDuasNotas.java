package exercicios;

import java.util.Scanner;
public class MediaEntreDuasNotas {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		nota1 = entrada1.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		nota2 = entrada2.nextFloat();
		
		media = (nota1+nota2)/2;
		
		System.out.print("média é:");
		System.out.print(media);
		
		entrada1.close();
		entrada2.close();
	}

}
