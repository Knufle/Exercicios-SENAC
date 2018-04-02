package exemplosfacul;

public class Lacorepeticaodowhile {
	
	public static void main(String[] args) {
		
		int i=0;
		
		do {
			
			if( i%2 == 0 )
				System.out.printf("%d é par \n", i);
			else
				System.out.printf("%d é impar \n", i);
		} while( i<=17 );
		
	}

}
