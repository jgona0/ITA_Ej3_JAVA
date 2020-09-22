import java.util.*;

public class E3 {

	public static void main(String[] args) {
		
		/*----------
		-- FASE 1 --
		----------*/
		System.out.println(" Fase 1:");

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
		
		////els poso aqui per no tenir que introduir-los cada cop
		//s0="Barcelona";
		//s1="Madrid";
		//s2="Valencia";
		//s3="Malaga";
		//s4="Cadis";
		//s5="Santander";

		// Mostra per consola el nom de les 6 ciutats.
		System.out.println(s0 + " , " + s1 + " , " + s2 + " , " + s3 + " , " + s4 + " , " + s5);
		
		
		
		/*----------
		-- FASE 2 --
		----------*/	
		System.out.println(" \n Fase 2:");

		// Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats).
		String[] arrayCiutats = new String[6];
		
		arrayCiutats[0]= s0;
		arrayCiutats[1]= s1;
		arrayCiutats[2]= s2;
		arrayCiutats[3]= s3;
		arrayCiutats[4]= s4;
		arrayCiutats[5]= s5;
		
		// Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic.
		Arrays.sort(arrayCiutats);
		
		for (int i = 0; i<arrayCiutats.length;i++) {
			
			System.out.println(arrayCiutats[i]);
			
		}

		
		
		
		/*----------
		-- FASE 3 --
		----------*/
		System.out.println(" \n Fase 3:");
		
		//Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades).
		String[] arrayCiutatsModificades = new String[6];
		
		for (int j = 0; j<arrayCiutats.length;j++) {
			
			arrayCiutatsModificades[j] = arrayCiutats[j].replace('a', '4');
			
			System.out.println(arrayCiutatsModificades[j]);
			
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
		for (int z = 0; z<c0.length; z++) {
			c0[z] = s0.charAt(z);
		}
		
		for (int a = 0; a<c1.length; a++) {
			c1[a] = s1.charAt(a);
		}
		
		for (int b = 0; b<c2.length; b++) {
			c2[b] = s2.charAt(b);
		}
		
		for (int c = 0; c<c3.length; c++) {
			c3[c] = s3.charAt(c);
		}
		
		for (int d = 0; d<c4.length; d++) {
			c4[d] = s4.charAt(d);
		}
		
		for (int e = 0; e<c5.length; e++) {
			c5[e] = s5.charAt(e);
		}
		
		
		//Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).
		for (int f=c0.length-1; f>=0; f--) {
			System.out.print(c0[f]);
		}
		System.out.print("\n");
		
		for (int g=c1.length-1; g>=0; g--) {
			System.out.print(c1[g]);
		}
		System.out.print("\n");
		
		for (int h=c2.length-1; h>=0; h--) {
			System.out.print(c2[h]);
		}
		System.out.print("\n");
		
		for (int i=c3.length-1; i>=0; i--) {
			System.out.print(c3[i]);
		}
		System.out.print("\n");
		
		for (int j=c4.length-1; j>=0; j--) {
			System.out.print(c4[j]);
		}
		System.out.print("\n");
		
		for (int k=c5.length-1; k>=0; k--) {
			System.out.print(c5[k]);
		}
		
	}
}
