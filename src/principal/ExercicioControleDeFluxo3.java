package principal;

public class ExercicioControleDeFluxo3 {

	public static void main(String[] args) {
		byte dia = 10;
		switch (dia) {
		case 1:
			System.out.println("domingo: final de semana");
		    break;
		case 2 :
			System.out.println("segunda dia util");
			break;	
		case 3 :
			System.out.println("terça dia util");
			break;
		case 4 :
			System.out.println("quarta dia util");
			break;
		case 5 :
			System.out.println("quinta dia util");
			break;
		case 6 :
			System.out.println("sexta dia util");
			break;
		case 7 :
			System.out.println("sábado fim de semana");
			break;
			default:
				System.out.println("código inválido");
						}

		// OU PODERIA SER USADO DA SEGUINTE MANEIRA TAMBÉM
		
		byte dds = 7;  //igual o códido anterior
		switch (dds) {
		case 1:
		case 7:
			System.out.println("fim de semana");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("dia util");
			break;
		default:
			System.out.println("opção inválida");
		}
		
		
		
	}

}
