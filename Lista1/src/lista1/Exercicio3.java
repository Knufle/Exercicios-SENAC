package lista1;

public class Exercicio3 {

	public static void main(String[] args) {

		int b=0;
		for (int a=33; a<=143; a++) {

			if (a%7 == 0) {
				System.out.printf("%d � m�ltiplo de 7 \n", a);
				b++;
			}
				else {
					System.out.println("N�o � m�ltiplo");
				}
			}

		System.out.printf("%d � a quantidade de m�ltiplos existentes\n", b);

	}

}
