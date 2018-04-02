package exemplosfacul;

public class Lacorepeticaowhile {

	public static void main(String[] args) {
		
		int i=0;
		
		while( i<=17 ) {
			
			if( i%2 == 0)
				System.out.printf("%d é par \n", i);
			else
				System.out.printf("%d é ímpar \n", i);
			i++;
		}
		
	}
	
}

