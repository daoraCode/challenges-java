package mardi;

import lundi.Clavier;

public class Somme {
	
	
	private static double somme() {
		System.out.println("Saisir 4 chiffres à la suite : ");
		int iterator = 0;
		double somme = 0;
		for (iterator = 0; iterator<4; iterator++) {
			int x = Clavier.lireInt();
			somme += x;
		}
		
		System.out.println("Résultat des 4 chiffres : " + somme);
		return somme;
	    }
	
		/*public static void main(String[] args) {
			somme();
		}*/
}
