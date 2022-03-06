package desafio2.teste;

public class Questao2 {

	public static void main(String[] args) {

		int[] n = { 1, 5, 3, 4, 2 };		
		int x = 2;
		
		int elPrMesmaDif = elementosParesDeMesmaDiferenca(n, x);
		
		System.out.println("Elementos pares: " + elPrMesmaDif + " de diferença igual a: " + x);
	}
	
	public static int elementosParesDeMesmaDiferenca(int[] n, int x) {

		int pares = 0;
//		int[] n = { 1, 5, 3, 4, 2 };

		for (int y = 0; y < n.length; y++) {

			for (int z = 0; z < n.length; z++) {
				if (n[y] - n[z] == x) {
					pares++;
				}
			}
		}		
		return pares;	
	}
}
