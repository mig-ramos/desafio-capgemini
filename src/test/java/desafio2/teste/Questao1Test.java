package desafio2.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class Questao1Test {

	@Test
	public void testElementoMediano() {
		
		int[] arr = { 9, 2, 1, 4, 6 };
		
		Questao1 q1 = new Questao1();
		int elMediano = q1.elementoMediano(arr);
		assertEquals(4, elMediano);
	}

}
