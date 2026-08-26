import java.util.Scanner;

import funcionario.FuncionarioSolarPalmeiras;

public class Main {

	public static void main(String[] args) {
		
		FuncionarioSolarPalmeiras funcionario = new FuncionarioSolarPalmeiras();

		Scanner leia = new Scanner(System.in);
		
		int escolherCargo;
	
		
		
		System.out.println("============================================");
		System.out.println(" CONDOMÍNIO RESIDENCIAL SOLAR DAS PALMEIRAS");
		System.out.println("============================================");
		System.out.print("Nome do funcionário: ");
		funcionario.nome = leia.nextLine();
		
		System.out.println("=========================================");
		System.out.println(" " + funcionario.nome.toUpperCase());
		System.out.println("=========================================");
		System.out.println("DIGITE O SEU CARGO: ");
		System.out.println("(1) PORTEIRO");
		System.out.println("(2) AUXILIAR DE APOIO");
		System.out.println("(3) ZELADOR");
		System.out.println("(4) ASSISTENTE ADMINISTRATIVO");
		System.out.println("(5) SÍNDICO");
		
		escolherCargo = leia.nextInt();
		
		switch (escolherCargo) {
		case 1:
			
			funcionario.cargo = "PORTEIRO";
			funcionario.salarioBruto = FuncionarioSolarPalmeiras.SALARIO_PORTEIRO;
			
		break;
		case 2:
			
			funcionario.cargo = "AUXILIAR DE APOIO";
			funcionario.salarioBruto = FuncionarioSolarPalmeiras.SALARIO_AUXILIAR;
			
		break;
		case 3:
			
			funcionario.cargo = "ZELADOR";
			funcionario.salarioBruto = FuncionarioSolarPalmeiras.SALARIO_ZELADOR;
			
		break;
		case 4:
			
			funcionario.cargo = "ASSISTENTE ADMINISTRATIVO";
			funcionario.salarioBruto = FuncionarioSolarPalmeiras.SALARIO_ASSISTENTE;
			
		break;
		case 5:
			
			funcionario.cargo = "SÍNDICO";
			funcionario.salarioBruto = FuncionarioSolarPalmeiras.SALARIO_SINDICO;
			
		break;
		}
		
		System.out.println("=========================================");
		System.out.print("ANOS DE TRABALHO NA EMPRESA: ");
		funcionario.anosEmpresa = leia.nextInt();
		
		funcionario.verAumento();
		
		funcionario.calcularSalarioLiquido();
		
		System.out.println(funcionario);
		
		leia.close();
		
	}

}
