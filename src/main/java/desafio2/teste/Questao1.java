package desafio2.teste;

import java.util.Arrays;

public class Questao1 {

	public static void main(String[] args) {
		int[] arr = { 9, 2, 1, 4, 6 };

		Questao1 q1 = new Questao1();
		int elMediano = q1.elementoMediano(arr);
		System.out.println("O elemento mediano da lista é: " + elMediano);
	}

	public int elementoMediano(int[] arr) {

		int meioDaLista = 0;

		// Encontrando meioDaLista se for impar
		if ((arr.length) % 2 != 0) {
			meioDaLista = arr.length / 2;

			// Ordenando o vetor
			Arrays.sort(arr);

		} else {
			System.out.println("Número de elementos da lista não é impar.");
		}

		return arr[meioDaLista];
	}
}
