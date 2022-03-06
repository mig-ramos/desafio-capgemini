package desafio2.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class Questao3Test {

	@SuppressWarnings("static-access")
	@Test
	public void testEncriptador() {

		String frase = "tenha um bom dia";
		
		Questao3 q3 = new Questao3();		
		String fraseEncriptada = q3.encriptador(frase);
		assertEquals("taoa eum nmd hbi ", fraseEncriptada);
	}
}
