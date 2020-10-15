/*
 * Tercer exercici IT ACADEMY
 * Xavi Gonzalez JAVA-1
 */


import java.util.*;
import java.util.ArrayList;

public class TercerExerciciApp {

	public static void main(String[] args) {
		

		// Crea sis variables tipu string buides
		String s0, s1, s2, s3, s4, s5 = "";
		
		// Demana per consola que s’introdueixin els noms 
		System.out.println("Introduce las ciudades:");
		
			Scanner entrada = new Scanner(System.in);
	
			s0=entrada.nextLine();
			s1=entrada.nextLine();
			s2=entrada.nextLine();
			s3=entrada.nextLine();
			s4=entrada.nextLine();
			s5=entrada.nextLine();


		// Mostra per consola el nom de les 6 ciutats.
		System.out.println(s0 + " , " + s1 + " , " + s2 + " , " + s3 + " , " + s4 + " , " + s5);
		
		
		
		/*----------
		-- FASE 2 --
		----------*/	
		System.out.println(" \n Fase 2:");

		// Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats).
		ArrayList<String> arrayCiutats = new ArrayList<String>();
		
		arrayCiutats.add(s0);
		arrayCiutats.add(s1);
		arrayCiutats.add(s2);
		arrayCiutats.add(s3);
		arrayCiutats.add(s4);
		arrayCiutats.add(s5);
		
		// Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic.
		Collections.sort(arrayCiutats);
		
		for (String i : arrayCiutats) {
			System.out.println(i);
		}

		
		
		
		/*----------
		-- FASE 3 --
		----------*/
		System.out.println(" \n Fase 3:");
		
		//Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades).		
		ArrayList<String> arrayCiutatsModificades = replaceA(arrayCiutats);
		
		for (String i : arrayCiutatsModificades) {
			System.out.println(i);
		}


		
	
		/*----------
		-- FASE 4 --
		----------*/
		System.out.println(" \n Fase 4:");
		
		// Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de cada string (string nomCiutat.Length)
		char[] c0 = new char[s0.length()];
		char[] c1 = new char[s1.length()];
		char[] c2 = new char[s2.length()];
		char[] c3 = new char[s3.length()];
		char[] c4 = new char[s4.length()];
		char[] c5 = new char[s5.length()];
		
		// Ompliu els nous arrays lletra per lletra		
		fillArray(s0, c0);
		fillArray(s1, c1);
		fillArray(s2, c2);
		fillArray(s3, c3);
		fillArray(s4, c4);
		fillArray(s5, c5);
		
		
		//Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).
		reverseAndPrint(c0);
		reverseAndPrint(c1);
		reverseAndPrint(c2);
		reverseAndPrint(c3);
		reverseAndPrint(c4);
		reverseAndPrint(c5);
		
	}
	
	
	
	
	// Métode que reb un ArrayList i li canvia les 'a' per 4
	static ArrayList replaceA (ArrayList input) {
		
		ArrayList<String> arrayCiutatsModificades = new ArrayList<String>();
		
		for (int i = 0; i<input.size();i++) {
		
			arrayCiutatsModificades.add(((String) input.get(i)).replace('a', '4'));			
		}
		
		return arrayCiutatsModificades;
		
	}
	
	
	// Métode que omple un array de chars amb les lletres d'un string
	static void fillArray (String city, char[] input) {
		
		for (int z = 0; z<input.length; z++) {
			input[z] = city.charAt(z);
		}
		
	}
	
	
	// Métode que fa un reverse de l'ordre de les lletres d'un array de chars i l'imprimeix
	static void reverseAndPrint (char[] input) {
	
		for (int i=input.length-1; i>=0; i--) {
			System.out.print(input[i]);
		}
		System.out.print("\n");
		
	}
	
	
	
}
