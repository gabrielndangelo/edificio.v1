package funcionario;

public class FuncionarioSolarPalmeiras {

	public String nome;
	
	public String cargo;
	
	public int anosEmpresa;
	
	public double salarioBruto;
	
	public static final double SALARIO_PORTEIRO = 1800.00;
    public static final double SALARIO_AUXILIAR = 1650.00;
    public static final double SALARIO_ZELADOR = 1900.00;
    public static final double SALARIO_ASSISTENTE = 2200.00;
    public static final double SALARIO_SINDICO = 3500.00;
	
    public double aumento;
    
    public static final double gratificacao = 0.10;
    public static final double desconto = 0.08;
    
	public double gratificacaoSalario;
	public double descontoSalario;
	
	public double salarioLiquido;
    
    public void verAumento() {
    	
    	if (anosEmpresa < 3) {
    		aumento = salarioBruto * 0.05;
    		
    	}
    	else if (anosEmpresa >= 3 && anosEmpresa < 9) {
    		aumento = salarioBruto * 0.08;
    		
    	}
    	else {
    		aumento = salarioBruto * 0.15;
    		
    	}
    	
    	
    }
    
    
    public void calcularSalarioLiquido() {
    	
    	 gratificacaoSalario = salarioBruto * gratificacao;
    	 descontoSalario = salarioBruto * desconto;
    	
    	 salarioLiquido = (salarioBruto + aumento + gratificacaoSalario) - descontoSalario; 
    	
    }
    
	
    public String toString() {
    	
    	return String.format("================================================%n" + 
    			"EDIFÍCIO SOLAR DAS PALMEIRAS%n" +
    			"FOLHA DE PAGAMENTO%n" +
    			"================================================%n" +
    			"Funcionário: " + "%s%n" +
    			"================================================%n" +
    			"Cargo: %s%n" +
    			"Tempo de Empresa: %d anos%n" +
    			"================================================%n" +
    			"Salário-base: R$ %.2f%n" +
    			"Bônus por tempo de Empresa: R$ %.2f%n" +
    			"Gratificação: R$ %.2f%n" +
    			"Descontos: R$ %.2f%n" +
    			"================================================%n" +
    			"REMUNERAÇÃO DO FUNCIONÁRIO: R$ %.2f%n",
    			nome.toUpperCase(),
    			cargo,
    			anosEmpresa,
    			salarioBruto,
    			aumento,
    			gratificacaoSalario,
    			descontoSalario,
    			salarioLiquido
    			);
    			
    	
    }
    
    
    
} // fim da classe