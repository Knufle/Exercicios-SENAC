package folha_de_pagamento;

public abstract class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	//construtor
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	// retorna first name
	
	public String getFirstName() {return firstName;}
	
	// retorna last name
	
	public String getLastName() {return lastName;}
	
	// retorna social security number
	
	public String getSocialSecurityNumber() {return socialSecurityNumber;}
	
	// retorna uma representacao em String do objeto Employee
	
	@Override
	public String toString() {
		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
	// metodo abstrato precisa ser sobrescrito por subclasses concretas
	
	public abstract double earnings(); // sem implementacao aqui
}
