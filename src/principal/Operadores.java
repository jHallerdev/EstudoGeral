package principal;

public class Operadores {

	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 20;
		int soma = numero1 + numero2;
		System.out.println("o valor de numero1 � " +numero1);
		
		/* NESTE CASO DO 1� SOUT O COMPILADOR N�O SOMA OS VALORES DAS VARIAVEIS ELE FAZ UMA CONCATENA��O NA LINHA DE COMANDO TODA,
		 * PELO FATO DE TER UMA STRING NO INICIO E DE N�O TER UM PARENTESES DEPOIS DAS ASPAS.	
		 */
		System.out.println("o valor � "+numero1 +numero2); 
		System.out.println("o valor � " +(numero1+numero2));
		System.out.println(numero1+numero2 +" o valor � " + numero1+numero2); // SOMOU AS DUAS VARIAVEIS E DEPOIS CONCATENOU O RESTANTE
		System.out.println("s� para mostrar resto da divis�o " + 21%2);	// S�MBOLO DE RESTO % INDICA SE SOBRA OU N�O (PAR OU IMPAR)

	}

}
