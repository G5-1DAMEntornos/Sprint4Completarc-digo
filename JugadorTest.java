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
		assertNull(jugador.getNombreJugador());
		
	}
	

	/**
	 * TC02 - Nombre (Numero carÃ¡cteres < 4)
	 */
	@Test
	void testSetNombreJugador2() {
		Jugador jugador = new Jugador();
		String nombre="Pe";
		jugador.setNombreJugador(nombre);
		assertNull(jugador.getNombreJugador());
		
		
	}

	/**
	 * TC03 - Nombre (Numero carÃ¡cteres minimo)
	 */
	@Test
	void testSetNombreJugador3() {
		Jugador jugador = new Jugador();
		String nombre= "Pepe";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador());
		
	
	}
	
	/**
	 * TC04 - Nombre (Numero carÃ¡cteres maximo)
	 */
	@Test
	void testSetNombreJugador4() {
		Jugador jugador = new Jugador();
		String nombre= "PepePepePepePepePepe";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador(), "Caracteres introducidos insuficientes");
		

	}
	
	/**
	 * TC05 - Nombre (Numero carÃ¡cteres >20)
	 */
	@Test
	void testSetNombreJugador5() {
		Jugador jugador = new Jugador();
		String nombre= "PepePepePepePepePepeP";
		jugador.setNombreJugador(nombre);
		assertNull(jugador.getNombreJugador());		
		
	}
	
	/**
	 * TC05 - TC07 - Nombre (Caracteres Numericos)
	 */
	@Test
	void testSetNombreJugador6() {
		Jugador jugador = new Jugador();
		String nombre= "Pepe34";
		jugador.setNombreJugador(nombre);
		assertNull(jugador.getNombreJugador());
		
		
	}
	/**
	 * TC05 - TC18 - Nombre (Null)
	 */
	@Test
	void testSetNombreJugador7() {
		Jugador jugador = new Jugador();
		String nombre= " ";
		jugador.setNombreJugador(nombre);
		assertNull(jugador.getNombreJugador());
		
	}
	/**
	 * STORY 7 SPRINT 4 Añade o actualiza los tests unitarios necesarios para que compruebe que el nombre es
guardado en mayusculas
	 */
	@Test
	void testSetNombreJugador8() {
		Jugador jugador = new Jugador();
		String nombre= "PEPITO";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador());
		
	}
	
	
	
	/**
	 * TC08 - Edad (Caracter)
	 */
	@Test
	void testSetEdad8() {
		Jugador jugador = new Jugador();
		int edad= 18;
		jugador.setEdad(edad);
		assertEquals(edad, jugador.getEdad(), "Caracter no valido");
		
	}
	
	/**
	 * TC11 - Edad (Numero Negativo)
	 */
	@Test
	void testSetEdad9() {
		Jugador jugador = new Jugador();
		int edad= -10;
		jugador.setEdad(edad);
		assertEquals(jugador.getEdad(), 0);
		
	}
	/**
	 * TC09 - Edad (Menor edad)
	 */
	@Test
	void testSetEdad10() {
		Jugador jugador = new Jugador();
		int edad= 5;
		jugador.setEdad(edad);
		
		assertEquals(jugador.getEdad(), 0);
		
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
	 * TC13 - Idioma (EspaÃ±ol). Mediante esta prueba, introduciremos un idioma valido. El test debera ser valido
	 */

	@Test
	void testSetIdioma13() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Español";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma());
	}
	
	/**
	 * TC14 - Idioma (Aleman). Mediante esta prueba, introduciremos un idioma valido. El test debera ser valido
	 */

	@Test
	void testSetIdioma14() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Aleman";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma());
	}
	
	/**
	 * TC15 - Idioma (FrancÃƒÂ©s). Mediante esta prueba, introduciremos un idioma valido. El test debera ser vÃƒÂ¡lido
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
		 
		 String idioma="";
		 jug.setIdioma(idioma);
		 assertNull(jug.getIdioma());
	}

	/**
	 * TC17 - Idioma (EspaÃ±ol). Mediante esta prueba, introduciremos un idioma distinto de los disponibles. El test debera ser no valido
	 */

	@Test
	void testSetIdioma17() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Español";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma(),"El idioma introducido no es correcto.");
	}
	
	//----------------------------Story 5 TESTS Aragon-------------------------------------------
	
	@Test
    //T00- Todo null. OUTPUT-->Error
    void tipoJugadorAllNull() {

       Jugador jugador = new Jugador();
       int edad=-1;
       String nombre="";
       String idioma="";
       
       jugador.setNombreJugador(nombre);
       jugador.setIdioma(idioma);
       jugador.setEdad(edad);
       
       String categoria=jugador.tipoJugador(edad);
       
       assertEquals(null, categoria);
       assertNull(jugador.getNombreJugador());
       assertNull(jugador.getIdioma());
     }
	
	@Test
    //T01- Edad null. OUTPUT-->Error
    void tipoJugadorEdadNull() {

       Jugador jugador = new Jugador();
       int edad=-1;
       String nombre="Pepe";
       String idioma="Español";
       
       jugador.setNombreJugador(nombre);
       jugador.setIdioma(idioma);
       jugador.setEdad(edad);
       
       String categoria=jugador.tipoJugador(edad);
       
       assertEquals(null, categoria);
       assertNotNull(jugador.getNombreJugador());
       assertNotNull(jugador.getIdioma());
     }
	
	@Test
    //T-02 Nombre Null
    void tipoJugadorNombreNull() {

        Jugador jugador = new Jugador();
        int edad=19;
        String nombre="";
        String idioma="Español";
        
        jugador.setNombreJugador(nombre);
        jugador.setIdioma(idioma);
        jugador.setEdad(edad);
        
        String categoria=jugador.tipoJugador(edad);
        
        assertNotNull(categoria);
        assertNull(jugador.getNombreJugador());
        assertNotNull(jugador.getIdioma());
      }
	
	@Test
    //T-03 Idioma Null
    void tipoJugadorIdiomaNull() {

        Jugador jug = new Jugador();
        int edad=19;
        String nombre="Pepe";
        String idioma="";
        
        jug.setNombreJugador(nombre);
        jug.setIdioma(idioma);
        jug.setEdad(edad);
        
        String categoria=jug.tipoJugador(edad);
        
        assertNotNull(categoria);
        assertNotNull(jug.getNombreJugador());
        assertNull(jug.getIdioma());
      }
	
	@Test
    //T04- Edad fuera de Rango. OUTPUT-->Error
    void tipoJugadorFueraRango() {

        Jugador jugador = new Jugador();
        int edad=8;
        String nombre="Pepe";
        String idioma="Español";
        
        jugador.setNombreJugador(nombre);
        jugador.setIdioma(idioma);
        jugador.setEdad(edad);
        
        String categoria=jugador.tipoJugador(edad);
        
        assertEquals(null, categoria);
        assertNotNull(jugador.getNombreJugador());
        assertNotNull(jugador.getIdioma());
      }
	
	@Test
    //T05- Edad Junior Minimo Valor. OUTPUT-->OKEY
    void tipoJugadorJuniorMin() {

        Jugador jugador = new Jugador();
        int edad=18;
        String nombre="Pepe";
        String idioma="Español";
        
        jugador.setNombreJugador(nombre);
        jugador.setIdioma(idioma);
        jugador.setEdad(edad);
        
        String categoria=jugador.tipoJugador(edad);
        
        assertEquals("Junior", categoria);
        assertNotNull(jugador.getNombreJugador());
        assertNotNull(jugador.getIdioma());
      }
	
	@Test
    //T06- Edad Junior Minimo Valor. OUTPUT-->OKEY
    void tipoJugadorJuniorMax() {

        Jugador jugador = new Jugador();
        int edad=24;
        String nombre="Pepe";
        String idioma="Español";
        
        jugador.setNombreJugador(nombre);
        jugador.setIdioma(idioma);
        jugador.setEdad(edad);
        
        String categoria=jugador.tipoJugador(edad);
        
        assertEquals("Junior", categoria);
        assertNotNull(jugador.getNombreJugador());
        assertNotNull(jugador.getIdioma());
      }
	
	@Test
    //T07- Edad Senior. OUTPUT-->OKEY
    void tipoJugadorSeniorMin() {

        Jugador jugador = new Jugador();
        int edad=25;
        String nombre="Pepe";
        String idioma="Español";
        
        jugador.setNombreJugador(nombre);
        jugador.setIdioma(idioma);
        jugador.setEdad(edad);
        
        String categoria=jugador.tipoJugador(edad);
        
        assertEquals("Senior", categoria);
        assertNotNull(jugador.getNombreJugador());
        assertNotNull(jugador.getIdioma());
      }
	
	@Test
    //T08- Edad Senior. OUTPUT-->OKEY
    void tipoJugadorSeniorMax() {

        Jugador jugador = new Jugador();
        int edad=35;
        String nombre="Pepe";
        String idioma="Español";
        
        jugador.setNombreJugador(nombre);
        jugador.setIdioma(idioma);
        jugador.setEdad(edad);
        
        assertEquals("Senior", jugador.tipoJugador(edad));
        assertNotNull(jugador.getNombreJugador());
        assertNotNull(jugador.getIdioma());
      }
	
	@Test
    //T09- Edad Master min. OUTPUT-->OKEY
    void tipoJugadorMasterMin() {

        Jugador jug = new Jugador();
        int edad=36;
        String nombre="Pepe";
        String idioma="Español";
        
        jug.setNombreJugador(nombre);
        jug.setIdioma(idioma);
        jug.setEdad(edad);
        
        String categoria=jug.tipoJugador(edad);
        
        assertEquals("Master", categoria);
        assertNotNull(jug.getNombreJugador());
        assertNotNull(jug.getIdioma());
      }
	
	@Test
    //T10- Edad Master Max. OUTPUT-->OKEY
    void tipoJugadorMasterAlto() {

        Jugador jug = new Jugador();
        int edad=70;
        String nombre="Pepe";
        String idioma="Español";
        
        jug.setNombreJugador(nombre);
        jug.setIdioma(idioma);
        jug.setEdad(edad);
        
        String categoria=jug.tipoJugador(edad);
        String buena="Master";
        
        assertEquals(buena, categoria);
        assertNotNull(jug.getNombreJugador());
        assertNotNull(jug.getIdioma());
      }
}
