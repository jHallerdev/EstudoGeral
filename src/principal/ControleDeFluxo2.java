package principal;

public class ControleDeFluxo2 {

	public static void main(String[] args) {
		int idade = 4;
		String status; // CRIADO UMA VARIAVEL STATUS DO TIPO STRING, USADA AQUI PARA USAR UM TEXTO EM CONDIÇÕES DIFERENTES 
		
		if (idade < 18) {
			status = "não adulto";
		}
		else {
			status = "adulto";
		}
		System.out.println(status);
		
		
		
		
	}

}
