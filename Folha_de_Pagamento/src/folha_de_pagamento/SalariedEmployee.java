package folha_de_pagamento;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	// construtor
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		
		if(weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
	}
	
	// setar salario
	
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary myst be >= 0.0");
		}
		
		this.weeklySalary = weeklySalary;
	}
	
	// retorna salario
	public double getWeeklySalary() {return weeklySalary;}
	
	// calcular ganhos; sobrescreve o metodo earnings em Employee
	
	@Override
	public double earnings() {return getWeeklySalary();}
	
	// retorna representacao em String do objeto SalariedEmployee
	@Override
	public String toString() {
		return String.format("salaried employee: %s%n%s: $%,.2f",
			super.toString(), "weekly salary", getWeeklySalary());
	}
}
