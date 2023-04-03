package aula19_Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		/*
		 * Implementar um programa que obtenha a cotação do dólar (U$) em relação ao
		 * real (R$) a seguir armazena em vetor A com 20 elementos as seguintes 
		 * conversões:
		 * A[x] = cotação do dolar * x,
		 * para todo x variando de 1 até 20
		 */

		Scanner ler = new Scanner(System.in);
		double cotacao = 0;
		double[] vetorA = new double[20];

		System.out.println("Entre com a cotacao do dolar: ");
		cotacao = ler.nextDouble();

		for (int x = 0; x < vetorA.length; x++) {
			vetorA[x] = cotacao * (x + 1);
		}
		DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
		System.out.print("VetorA= ");
		for (int x = 0; x < vetorA.length; x++) {
			System.out.print(decimalFormat.format(vetorA[x]) + " ");
		}
	}
}
