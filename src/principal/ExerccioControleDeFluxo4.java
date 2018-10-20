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
					// AQUI VALE UM COMENTÁRIO: SE O SOUT FOR COLOCADO FORA DAS CHAVES DE IF NÃO
					// SERÁ IMPRESSO O IF, SIMPLESMENTE SERÁ EXECUTADO NORMAL O FOR
					// NÃO VAI ACUSAR ERRO DE SINTAXE PORÉM A CONDIÇÃO DE IDENTIFICAR OS IMPARES NÃO
					// SERÁ REALIZADA.
					// PARA DAR CERTO A LOCALIZAÇÃO DOS IMPARES NESTE CASO, MANTENHA O SOUT DENTRO
					// DAS CHAVES DE IF.
					System.out.println("imprima somente numeros impares:   " + i);
				}
				// else {
				// n == String);
				// System.out.println("caracter inválido");
				// }
			}
		} catch (InputMismatchException e) {
			System.out.println("texto invalido");	
		}
	}
}
