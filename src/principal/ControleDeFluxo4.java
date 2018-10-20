package principal;

public class ControleDeFluxo4 {

	public static void main(String[] args) {
		int contador = 0;
		while(contador < 10) {
			
			System.out.println(contador++);
			
		}
		
		do {
			System.out.println("teste de repetição");
			
		}while (contador == 0);
		
		
		//O FOR É CONSTITUÍDO DE 3 PARTES, CRIAR A VAR E INICIAR ELA, DAR A CONDIÇÃO A ELA, ATRIBUIR O INCREMENTO
		for (int i = 0; i < 10; i++) {  
			System.out.println("valor de i é: " +i );
			if (i == 8) {
				break;
			}
			
		}
		
		

	}

}
