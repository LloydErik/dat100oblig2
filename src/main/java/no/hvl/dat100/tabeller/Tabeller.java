package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for(int element : tabell){
			System.out.println(element);
		}
	}

	// b)
	public static String tilStreng(int[] tabell){
		String result = "[";

		for (int i = 0; i < tabell.length; i++) {
			result += tabell[i];
			if (i < tabell.length - 1) {
				result += ",";
			}
		}

		result += "]";
		return result;
	}

	// c)
	public static int summer(int[] tabell) {
		int result = 0;
		for(int element : tabell){
			result += element;
		}
		return result;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean result = false;
		for(int element : tabell){
			if(element == tall){
				result = true;
				break;
			}
		}
		return result;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		boolean ting = false;
		int i = 0;
		for (int element : tabell) {

			if (element == tall) {
				ting = true;
				return i;

			}
			i++;
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] newlist = new int[tabell.length];
		int j = 0;
		for(int i =tabell.length-1; i>=0;i--){
			newlist[j] = tabell[i];
			j++;
		}
		return newlist;

	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for(int i = 0; i < tabell.length-1; i++){
			if(tabell[i]>tabell[i+1]){
				return false;
			}

			}
		return true;
		}


	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2){
		int[] sammensatt = new int[tabell1.length+tabell2.length];
		for(int i = 0; i < tabell1.length; i++){
			sammensatt[i] = tabell1[i];
		}
		for(int i = 0 ; i < tabell2.length; i++){
			sammensatt[tabell1.length + i]=tabell2[i];
		}
		return sammensatt;

	}
}