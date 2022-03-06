package desafio2.teste;

public class Questao3 {

	public static void main(String[] args) {
		String frase = "tenha um bom dia";

		String fraseEncriptada = encriptador(frase);
		System.out.println("Imprindo a saída encriptada: " + fraseEncriptada);
	}

	public static String encriptador(String frase) {

		int tamanho = 0;
		double raiz = 0.0;
		int grid = 0;
		String encriptando = "";
		String fraseEncriptada = "";

		// Retirando os espaços em branco
		String fraseSemEspacos = frase.replaceAll("\\s+", "");
		System.out.println("Frase sem espaços: " + fraseSemEspacos);

		// Contando os caracteres
		tamanho = fraseSemEspacos.length();
		System.out.println("Comprimento da frase: " + tamanho);

		// Extraindo a raiz
		raiz = Math.sqrt(tamanho);
		// Grid - Arredondando numero raiz para mais
		grid = (int) Math.ceil(raiz);
		System.out.println("Cabe dentro de uma matriz bidimensional de: " + raiz + " arrendondando: " + grid);

		char gridXY[][] = new char[grid][grid];
		int cont = 0;
		System.out.println("Imprimindo os caracteres dentro da matriz:");
		for (int l = 0; l < grid; l++) {
			for (int c = 0; c < grid; c++) {
				if (cont == tamanho) {
					break; // Para evitar o erro fora do RANGE
				}
				gridXY[l][c] = fraseSemEspacos.charAt(cont);
				cont++;
				System.out.print(gridXY[l][c]);
			}
			System.out.println();
		}

		// Lendo os caracteres de forma encriptada
		for (int c = 0; c < grid; c++) {
			for (int l = 0; l < grid; l++) {
				encriptando += String.valueOf(gridXY[l][c]);
			}

			// O que não for caracter alfabetico eh eliminado,
			fraseEncriptada += encriptando.replaceAll("[^a-z,A-Z]+", "");
			// deixando um espaco entre as palavras, exceto no final da frase
			if(c != grid) fraseEncriptada += " ";
			
			encriptando = "";
		}
	//	System.out.println("Imprindo a saída encriptada: " + fraseEncriptada);
		return fraseEncriptada;
	}
}
