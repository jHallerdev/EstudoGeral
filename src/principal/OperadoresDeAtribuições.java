package principal;

public class OperadoresDeAtribui��es {

	public static void main(String[] args) {
		// =, -=, +=, /=, *=, %=   OPERADORES DE ATRIBUI��O S�O FEITOS PARA DIMINUIR OS C�DIGOS E SER MAIS AGIL
		
		int salario = 1800;
	    salario = salario + 1000;  // ATRIBUI +1000 A VAR SALARIO
		salario += 1000;           // FAZ EXATAMENTE A MESMA FUN��O DA LINHA ANTERIOR ISSO DEIXA O C�DIGO MAIS LIMPO E MAIS PROFISSIONAL
        //salario = salario * 0.1; ESSA LINHA DA O SEGUINTE ERRO: Type mismatch: cannot convert from double to int, PARA RESOLVER ISSO FAZ O SEGUINTE
		salario = salario + (int) (salario * 0.1);  // AQUI FOI USADO UM CAST PARA N�O MUDAR O TIPO DA VARIAVEL
		int numero = 11;
		numero = numero %2;  // FORMA EXTENSA DO C�DIGO
		numero %=2;          // FAZ A MESMA FUN��O DA LINHA ANTERIOR POR�M MAIS LIMPO
		
		System.out.println(numero);
		System.out.println(salario);
		
		
	}

}
