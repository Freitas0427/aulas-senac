package Senac;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valor = 0, valorMaior = 0, valorMenor=0, media = 0, total = 0, cont = 0, soma = 0;
		do {
			System.out.println("Digite um valor: ");
			valor = teclado.nextDouble();
			total = total + valor;
			media = total / cont;
			
			if(cont==0) {valorMenor = valor;}
			if (valor > valorMaior) {valorMaior = valor;}
			if (valor < valorMenor  && valor !=0) {valorMenor = valor;}
			cont++;
		} while (valor != 0);
		{
			System.out.println("Soma: " + total);
			System.out.println("Maior: " + valorMaior);
			System.out.println("Menor: " + valorMenor);
			System.out.println("Media: " + media);
		}
	}
}
