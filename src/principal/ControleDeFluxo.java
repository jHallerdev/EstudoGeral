package principal;

public class ControleDeFluxo {

	public static void main(String[] args) {
		// IDADE < 15 CATEGORIA INFANTIL
		// IDADE >= 15 && IDADE <= 18 CATEGORIA JUVENIL
		// IDADE >= 18 CATEGORIA ADULTO
		
		/* ESTE MESMO BLOCO DE CÓDIGOS PODE SER FEITO DE OUTRA FORMA EFICIENTE E CLARA, PORÉM O MESMO ESTA CORRETO E FUNCIONANDO.
		* 
		*int idade = 19;
		*
		*if (idade < 15) {
		*			System.out.println("categoria infantil");
		*		}
		*else if (idade >= 15 && idade <= 18){
		*	System.out.println("categoria juvenil");
		*}
		*else  {
		*	System.out.println("categoria adulto");
		*}
		*/
	     
		 /* NESTE PRÓXIMO BLOCO DE CÓDIGO FARÁ A MESMA FUNÇÃO DO ANTERIOR, PORÉM COM APENAS UM SYSTEM.OUT.PRINT E CRIANDO UMA 
		  * VAR DO TIPO STRING. 
		 */
		
		int idade = 17;
		String categoria;
				if(idade < 15) {
			categoria = "infantil";
		}
		else if(idade >= 15 && idade <= 18) {
			categoria = "juvenil";
		}
				else {
			categoria = "adulto";
		}
				System.out.println(categoria);
			}

}
