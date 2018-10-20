package principal;

public class Operadores {

	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 20;
		int soma = numero1 + numero2;
		System.out.println("o valor de numero1 é " +numero1);
		
		/* NESTE CASO DO 1º SOUT O COMPILADOR NÃO SOMA OS VALORES DAS VARIAVEIS ELE FAZ UMA CONCATENAÇÃO NA LINHA DE COMANDO TODA,
		 * PELO FATO DE TER UMA STRING NO INICIO E DE NÃO TER UM PARENTESES DEPOIS DAS ASPAS.	
		 */
		System.out.println("o valor é "+numero1 +numero2); 
		System.out.println("o valor é " +(numero1+numero2));
		System.out.println(numero1+numero2 +" o valor é " + numero1+numero2); // SOMOU AS DUAS VARIAVEIS E DEPOIS CONCATENOU O RESTANTE
		System.out.println("só para mostrar resto da divisão " + 21%2);	// SÍMBOLO DE RESTO % INDICA SE SOBRA OU NÃO (PAR OU IMPAR)

	}

}
