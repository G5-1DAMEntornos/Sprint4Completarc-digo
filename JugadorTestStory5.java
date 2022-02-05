import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadorTestStory5{

	@Test
    //T00- Todo null. OUTPUT-->Error
    void tipoJugadorAllNull() {

       Jugador jugador = new Jugador();
       int edad=-1;
       String nombre=null;
       String idioma=null;
       
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
        String nombre=null;
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
        String idioma=null;
        
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
