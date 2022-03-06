package desafio2.teste;

import java.util.Arrays;

public class Questao1 {

	public int elementoMediano(int[] arr) {

		int meioDaLista = 0;

		// Encontrando meioDaLista se for impar
		if ((arr.length) % 2 != 0) {
			meioDaLista = arr.length / 2;

			// Ordenando o vetor
			Arrays.sort(arr);

			// Valor do meio da lista após a ordenação
			System.out.println(arr[meioDaLista]);

		} else {
			System.out.println("Número de elementos da lista não é impar.");
		}

		return arr[meioDaLista];
	}
}
