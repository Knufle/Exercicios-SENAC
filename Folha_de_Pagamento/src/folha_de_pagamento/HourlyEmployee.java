package folha_de_pagamento;

public class HourlyEmployee extends Employee{
	private double wage; // salario por hora
	private double hours; // horas trabalhadas na semana
	
	// construtor
	public HourlyEmployee(String firstName, String lastName,
			String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (wage < 0.0) { // valida salario
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}
		
		if ((hours < 0.0) || (hours > 168.0)) { // valida horas
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.wage = wage;
		this.hours = hours;
	}
	
	// seta salario
	public void setWage(double wage) {
		if (wage < 0.0) { // valida salario
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}
		
		this.wage = wage;
	}
	
	// retorna salario
	public double getWage() {return wage;}
	
	// seta horas trabalhadas
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // valida horas
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}
		this.hours = hours;
	}
	
	// return hours worked
	public double getHours() {return hours;}
	
	// calcula earnings; sobrescreve o metodo abstrato earnings em Employee
	@Override
	public double earnings() {
		if (getHours() <= 40) { // sem overtime
			return getWage() * getHours();
		}
		else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}
	
	// retorna representacao em String do objeto HourlyEmployee
	@Override
	public String toString() {
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
				super.toString(),"hourly wage", getWage(),
				"hours worked", getHours());
	}
}


