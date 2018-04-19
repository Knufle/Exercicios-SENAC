package aula02;

public class Aula {
	String materia;
	int duracao;
	boolean acontecendo;
	int dificuldade;
	float sala;

	void barulho() {
		if (this.duracao >= 5) {
		System.out.println("Os alunos estao gritando");
		} else {
			System.out.println("Os alunos estão quietos");
		}
	}
	
	void andamento() {
		this.acontecendo = true;
	}
}