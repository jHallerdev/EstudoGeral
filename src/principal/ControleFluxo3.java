package principal;

public class ControleFluxo3 {

	public static void main(String[] args) {
		byte dia = 1;
		Double cpf = 233.9;
		
		if(cpf.toString().replace(".", "").equals("2339")) {
		 
		System.out.println("oioioi");
		}
		//if(dia == 1) {
		//	System.out.println("domingo");		
		//	}
		//else if(dia == 2) {
		//	System.out.println("segunda feira");	
		//}
		//else if(dia == 3) {
		//	System.out.println("terça feira");		
		//}
		//else if(dia == 4) {
		//	System.out.println("quarta feira");		
		//}
		//else if(dia == 5) {
		//	System.out.println("quinta feira");		
		//}
		//else if(dia == 6) {
		//	System.out.println("sexta feira");		
		//}
		//else if(dia == 7) {
		//	System.out.println("sábado");		
		//}
		// Dentro da switch só os tipos char, int, byte, short, enum, string podem ser usados 
		switch(dia) {
		case 1:
			System.out.println("domingo");
			
		case 2:
			System.out.println("segunda");
			
		case 3:
			System.out.println("terça feira");
			
		case 4:
			System.out.println("quarta feira");
			break;
		case 5:
			System.out.println("quinta feira");
			
		case 6:
			System.out.println("sexta feira");
			
		case 7:
			System.out.println("sábado");
						
		}
		
		char sexo = '8'; // DETALHE IMPORTANTE SENDO CHAR USAR APOSTROFE E NUNCA ASPAS, SE FOR STRING USAR ASPAS SEMPRE
		switch (sexo) {
		case 'F':
			System.out.println("Feminino");
			break;
		case 'M':
			System.out.println("Masculino");
			break;
		default:
			System.out.println("Opção Inválida");
		}
		
		
	}
}
