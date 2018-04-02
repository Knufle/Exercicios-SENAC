package lista1;

public class Exercicio3 {

	public static void main(String[] args) {

		int b=0;
		for (int a=33; a<=143; a++) {

			if (a%7 == 0) {
				System.out.printf("%d é múltiplo de 7 \n", a);
				b++;
			}
				else {
					System.out.println("Não é múltiplo");
				}
			}

		System.out.printf("%d é a quantidade de múltiplos existentes\n", b);

	}

}
