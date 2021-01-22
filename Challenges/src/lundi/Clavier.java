package lundi;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Scanner;

	public class Clavier {
		

		    //public static void main(String[] args) {
		    	
		        int retourInt = lireInt();
		        //System.out.println("Le nombre entier que vous avez entré est : " + retourInt);
		        
		        float retourFloat = lireFloat();
		        //System.out.print("Le flaot que vous avez entré est : " + retourFloat);
		        
		        double retourDouble = lireDouble();
		        //System.out.print("Le double que vous avez entré est : " + retourDouble);
		        
		    //}

		    
		    
		    public static String lireString() {    	
		    		String saisie = null;
		    		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		    		try {
		    			saisie = buffer.readLine();
		    			} catch(IOException exception) {
		    				exception.printStackTrace();
		    			}
		    		return saisie;
		    }
		    
		    public static int lireInt() {
		    	// Définition de la classe Scanner
		        Scanner clavier = new Scanner(System.in);
		        // System.out.println("Donnez un nombre entier : ");
		        int nombre = clavier.nextInt();        
		        // clavier.close();
		        return nombre;
		    }
		    
		    public static float lireFloat() {
		    	String saisie2 = lireString();
		    	// méthode .parseFloat() de la classe Float
		    	System.out.println("Donnez un float : ");
		    	float nbFloat = Float.parseFloat(saisie2);
		    	return nbFloat;
		    }
		    
		    public static double lireDouble() {
		    	String saisie3 = lireString();
		    	// méthode .parseDouble() de la classe Double
		    	System.out.println("Donnez un double : ");
		    	double nbDouble = Double.parseDouble(saisie3);
				return nbDouble;
		    }

		   
		}

