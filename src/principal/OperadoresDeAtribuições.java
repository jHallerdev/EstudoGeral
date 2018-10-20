package principal;

public class OperadoresDeAtribuições {

	public static void main(String[] args) {
		// =, -=, +=, /=, *=, %=   OPERADORES DE ATRIBUIÇÃO SÃO FEITOS PARA DIMINUIR OS CÓDIGOS E SER MAIS AGIL
		
		int salario = 1800;
	    salario = salario + 1000;  // ATRIBUI +1000 A VAR SALARIO
		salario += 1000;           // FAZ EXATAMENTE A MESMA FUNÇÃO DA LINHA ANTERIOR ISSO DEIXA O CÓDIGO MAIS LIMPO E MAIS PROFISSIONAL
        //salario = salario * 0.1; ESSA LINHA DA O SEGUINTE ERRO: Type mismatch: cannot convert from double to int, PARA RESOLVER ISSO FAZ O SEGUINTE
		salario = salario + (int) (salario * 0.1);  // AQUI FOI USADO UM CAST PARA NÃO MUDAR O TIPO DA VARIAVEL
		int numero = 11;
		numero = numero %2;  // FORMA EXTENSA DO CÓDIGO
		numero %=2;          // FAZ A MESMA FUNÇÃO DA LINHA ANTERIOR PORÉM MAIS LIMPO
		
		System.out.println(numero);
		System.out.println(salario);
		
		
	}

}
