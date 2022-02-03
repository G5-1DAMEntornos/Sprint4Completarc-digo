import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Syzer
 *
 */
class JugadorTest {

	/**
	 * TC01 - Nombre (Numero Caracteres Negativo)
	 */
	@Test
	void testSetNombreJugador1() {
		Jugador jugador = new Jugador();
		String nombre= "hola2";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador(), "Car�cter no permitido");
		
	}
	

	/**
	 * TC02 - Nombre (Numero car�cteres < 4)
	 */
	@Test
	void testSetNombreJugador2() {
		Jugador jugador = new Jugador();
		String nombre= "Pe";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre,jugador.getNombreJugador(),"Car�cteres introducidos insuficientes");
		
		
	}

	/**
	 * TC03 - Nombre (Numero car�cteres minimo)
	 */
	@Test
	void testSetNombreJugador3() {
		Jugador jugador = new Jugador();
		String nombre= "Pepe";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador());
		
	
	}
	
	/**
	 * TC04 - Nombre (Numero car�cteres maximo)
	 */
	@Test
	void testSetNombreJugador4() {
		Jugador jugador = new Jugador();
		String nombre= "PepePepePepePepePepe";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador(), "Car�cteres introducidos insuficientes");
		

	}
	
	/**
	 * TC05 - Nombre (Numero car�cteres >20)
	 */
	@Test
	void testSetNombreJugador5() {
		Jugador jugador = new Jugador();
		String nombre= "PepePepePepePepePepeP";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador(), "Excedido n�mero car�cteres permitido");
		
		
	}
	
	/**
	 * TC05 - TC07 - Nombre (Caracteres Numericos)
	 */
	@Test
	void testSetNombreJugador6() {
		Jugador jugador = new Jugador();
		String nombre= "Pepe34";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador(), "Car�cteres n�mericos no permitidos");
		
		
	}
	/**
	 * TC05 - TC18 - Nombre (Null)
	 */
	@Test
	void testSetNombreJugador7() {
		Jugador jugador = new Jugador();
		String nombre= " ";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador(), "Campo nombre vacio");
		
	}
	
	/**
	 * TC08 - Edad (Caracter)
	 */
	@Test
	void testSetEdad8() {
		Jugador jugador = new Jugador();
		int edad= 18;
		jugador.setEdad(edad);
		assertEquals(edad, jugador.getEdad(), "Car�cter no v�lido");
		
	}
	
	/**
	 * TC11 - Edad (Numero Negativo)
	 */
	@Test
	void testSetEdad9() {
		Jugador jugador = new Jugador();
		int edad= -10;
		jugador.setEdad(edad);
		assertEquals(edad, jugador.getEdad(), "N�meros negativos no permitidos");
		
	}
	/**
	 * TC09 - Edad (Menor edad)
	 */
	@Test
	void testSetEdad10() {
		Jugador jugador = new Jugador();
		int edad= 5;
		jugador.setEdad(edad);
		assertEquals(edad, jugador.getEdad(), "Menor de edad no permitido");
		
	}
	
	@Test
	void testSetEdad11() {
		Jugador jug= new Jugador();
		int edad= 20;
		jug.setEdad(edad);
		assertEquals(edad, jug.getEdad());
	}
		
	/**
	* TC12 - Edad (Null). Mediante esta prueba el test NO debe ser valido, al introducir un caracter vacio en un campo numerico.
	*/

	@Test
	void testSetEdad12() {
		Jugador jug= new Jugador();
		Integer edad= 0;
		jug.setEdad(edad);
		assertEquals(edad, jug.getEdad(),"Caracter introducido no valido, el caracter introducido debe ser numerico, y mayor a 18");
		
	}

	/**
	 * TC13 - Idioma (Espa�ol). Mediante esta prueba, introduciremos un idioma valido. El test debera ser valido
	 */

	@Test
	void testSetIdioma13() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Espa�ol";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma());
	}
	
	/**
	 * TC14 - Idioma (Aleman). Mediante esta prueba, introduciremos un idioma valido. El test debera ser valido
	 */

	@Test
	void testSetIdioma14() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Alem�n";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma());
	}
	
	/**
	 * TC15 - Idioma (Francés). Mediante esta prueba, introduciremos un idioma valido. El test debera ser válido
	 */

	@Test
	void testSetIdioma15() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Frances";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma());
	}
	
	/**
	 * TC16 - Idioma (null). Mediante esta prueba, no introduciremos un idioma . El test no debera ser valido
	 */

	@Test
	void testSetIdioma16() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= " ";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma(),"Caracter introducido insuficiente");
	}

	/**
	 * TC17 - Idioma (Espa�ol). Mediante esta prueba, introduciremos un idioma distinto de los disponibles. El test debera ser no valido
	 */

	@Test
	void testSetIdioma17() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Espa�ol";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma(),"El idioma introducido no es correcto.");
	}
}
