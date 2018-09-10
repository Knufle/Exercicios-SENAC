package folha_de_pagamento;

public class CommissionEmployee extends Employee{
	private double grossSales; // vendas semanais (bruto)
	private double commissionRate; // porcentagem comissao
	
	// construtor
	
	public CommissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales,
			double commissionRate) {
			super(firstName, lastName, socialSecurityNumber);
			
			if (commissionRate <= 0.0 || commissionRate >= 1.0) { // valida
				throw new IllegalArgumentException(
						"Commission rate must be > 0.0 and < 1.0");
			}
			
			if (grossSales < 0.0) { // valida
				throw new IllegalArgumentException("Gross sales must be >= 0.0");
			}
			
			this.grossSales = grossSales;
			this.commissionRate = commissionRate;
	}
	
	// seta quantidade vendas (bruto)
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // valida
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		this.grossSales = grossSales;
	}
	
	//retorna quantidade de vendas (bruto)
	public double getGrossSales() {return grossSales;}
	
	// seta multiplicador comissao
	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 0.0 || commissionRate >= 1.0) { // valida
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}
		
		this.commissionRate = commissionRate;
	}
	
	// retorna multiplicador comissao
	public double getCommissionRate() {return commissionRate;}
	
	// calcula earnings; sobrescreve metodo abstrato earnings em Employee
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	// retorna representacao em String do objeto CommissionEmployee
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
				"commission employee", super.toString(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}
}
