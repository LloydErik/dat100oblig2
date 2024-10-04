package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise){
		for(int[] rad : matrise){
			for(int element : rad){
				System.out.println(element);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String result = "";
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				result += matrise[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}

		return nyMatrise;
		}


	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a == b){
			return true;
		}
		return false;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int størrelse = matrise.length;

		int[][] speiletMatrise = new int[størrelse][størrelse];

		for (int i = 0; i < størrelse; i++) {
			for (int j = 0; j < størrelse; j++) {
				speiletMatrise[i][j] = matrise[j][i];
			}
		}

		return speiletMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		if (a[0].length != b.length) {
			throw new IllegalArgumentException("Antall kolonner i matrise A må være lik antall rader i matrise B.");
		}

		int[][] resultat = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					resultat[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return resultat;
	}
}
