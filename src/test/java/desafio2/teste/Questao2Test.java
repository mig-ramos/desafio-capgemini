package desafio2.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class Questao2Test {

	@SuppressWarnings("static-access")
	@Test
	public void testElementosParesDeMesmaDiferenca() {
		
		int x = 2;
		int[] n = { 1, 5, 3, 4, 2 };

		Questao2 q2 = new Questao2();
		int elMediano = q2.elementosParesDeMesmaDiferenca(n, x);
		assertEquals(3, elMediano);
	}
}
