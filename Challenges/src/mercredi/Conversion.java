package mercredi;

import lundi.Clavier;

public class Conversion {
	
	
	
	
	public static void conversion() {
		
		// 1 € = 1,23 $
		double montantDollars = 1;
		double iter = 0;
		
		for (iter = 0; iter < 100; iter++); {
			
			montantDollars = iter * 1.23;
			System.out.println("Montant en euros : " + iter + " montant en dollars " + montantDollars);

				
		}

	}	
	
	
	public static void main(String[] args) {
		conversion();
		
	}

}
