package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerccioControleDeFluxo4 {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		System.out.println("Digite um numero qualquer:");
		int n;

		try {
			n = valor.nextInt();

			for (int i = 0; i <= n; i++) {
				if (i % 2 == 1) {
					// AQUI VALE UM COMENT�RIO: SE O SOUT FOR COLOCADO FORA DAS CHAVES DE IF N�O
					// SER� IMPRESSO O IF, SIMPLESMENTE SER� EXECUTADO NORMAL O FOR
					// N�O VAI ACUSAR ERRO DE SINTAXE POR�M A CONDI��O DE IDENTIFICAR OS IMPARES N�O
					// SER� REALIZADA.
					// PARA DAR CERTO A LOCALIZA��O DOS IMPARES NESTE CASO, MANTENHA O SOUT DENTRO
					// DAS CHAVES DE IF.
					System.out.println("imprima somente numeros impares:   " + i);
				}
				// else {
				// n == String);
				// System.out.println("caracter inv�lido");
				// }
			}
		} catch (InputMismatchException e) {
			System.out.println("texto invalido");	
		}
	}
}
