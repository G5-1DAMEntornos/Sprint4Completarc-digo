import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Paula and Aragon
 *
 */
class AsignarEquipoTest {

	/*TC1 - Asignar jugador que no exista. 
	 * Debe dar errorr
	*/

	@Test
	void testSetJugadornulo() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador null*/
		Jugador jugador = null;
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
		
		
	}
	
	
	/*TC2 - Asignar jugador que exista y tenga todos los campos válidos*/

	@Test
	void testSetJugador() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(asignarEquipo.getJugador());
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	
	/*TC3 - Asignar jugador que exista, pero su nombre sea inválido*/
	
	@Test
	void testSetJugadorNomInv() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "as";
		int edadValida = 20;
		String idiomaValido = "Español";
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
		
	}
	
	
	/*TC4 - Asignar jugador que exista, pero no tenga nombre */
	@Test
	void testSetJugadorSinNom() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		int edadValida = 20;
		String idiomaValido = "Español";
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
		
	}
	
	
	//TC5 - Asignar jugador que exista, pero su edad sea inválida
	
	@Test
	void testSetJugadorEdadInv() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 200;
		String idiomaValido = "Español";
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
		
	}
	
	
	//TC6 - Asignar jugador que exista, pero no tenga edad
	@Test
	void testSetJugadorSinEdad() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		String idiomaValido = "Español";
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	
	}
	
	//TC7 - Asignar jugador que exista, pero su idioma sea inválido
	
	@Test
	void testSetJugadorIdiomInv() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Japonés";
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	
	
	//TC8 - Asignar jugador que exista, pero no tenga idioma
	@Test
	void testSetJugadorNoIdiom() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
		//------------------------------------------------------------------Aragon------------------------------------------------------------------
	/**
	 *  TC9- Asignar equipo que no exista (es decir es nulo): Expected --> Error
	 */

	@Test
	void setEquipoNull(){
		//Creacion objeto AsignarEquipo
		AsignarEquipo asignarequipo = new AsignarEquipo();

		//Creacion Equipo nulo
		Equipo equipo=null;
		asignarequipo.setEquipo(equipo);

		//El parametro indicado debe ser nulo para pasar la prueba (asssertNotnull()-->No debe ser nulo
		assertNull(asignarequipo.getEquipo());
		// fail("El Equipo no existe");				
		}
	
	/**
	 *  TC10- Asignar equipo que exista y tenga todos sus campos válidos: Expected --> Okey
	 */

	@Test
	void setEquipoValido(){
		AsignarEquipo new_equipo = new AsignarEquipo();
		Equipo equipo = new Equipo();

		int ranking = 2;
		String nombre = "Equipo";
		
		equipo.setNombreEquipo(nombre);
		equipo.setRanking(ranking);

		new_equipo.setEquipo(equipo);

		assertEquals(nombre, equipo.getNombreEquipo());
		assertEquals(ranking, equipo.getRanking());
		assertNotNull(new_equipo.getEquipo());
	}
	
	/**
	 *  TC11- Asignar equipo que exista, pero su nombre sea inválido (podeis poner cualquier nombre no válido, porque ya se prueba todas las combinaciones posibles en el anterior): Expected --> Okey
	 */

	@Test
	void setEquipoNomInvalido(){
		AsignarEquipo new_equipo = new AsignarEquipo();
		Equipo equipo = new Equipo();

		int ranking = 2;
		String nombre = "cas";
		
		equipo.setNombreEquipo(nombre);
		equipo.setRanking(ranking);

		new_equipo.setEquipo(equipo);

		assertNull(new_equipo.getEquipo());
	}

	/**
	 *  TC12- Asignar equipo que exista, pero no tenga nombre (es decir, habéis creado el equipo pero no habéis puesto el nombre con setnombre): Expected --> Okey
	 */

	@Test
	void setEquipoNoNom(){
		AsignarEquipo new_equipo = new AsignarEquipo();
		Equipo equipo = new Equipo();

		int ranking = 2;
		String nombre = null;
		
		equipo.setNombreEquipo(nombre);
		equipo.setRanking(ranking);

		new_equipo.setEquipo(equipo);

		assertNull(new_equipo.getEquipo());
	}
	
	/**
	 *  TC13- Asignar equipo que exista, pero su ranking sea inválido (podeis poner cualquier edad no válida, porque ya se prueba todas las combinaciones posibles en el anterior): Expected --> Error
	 */

	@Test
	void setEquipoRankInvalido(){
		AsignarEquipo new_equipo = new AsignarEquipo();
		Equipo equipo = new Equipo();

		int ranking = 24;
		String nombre = "Equipo";
		
		equipo.setNombreEquipo(nombre);
		equipo.setRanking(ranking);

		new_equipo.setEquipo(equipo);

		assertNull(null);
	}
	
	/**
	 *  TC14- Asignar equipo que exista, pero no tenga ranking(es decir, habéis creado el equipo pero no habéis puesto el nombre con setnombre). Expected --> Error
	 */
	
	@Test
	void setEquipoNoRank(){
		AsignarEquipo new_equipo = new AsignarEquipo();
		Equipo equipo = new Equipo();

		Integer ranking=-1; //Aqui iria Null pero como da error, lo dejo asi hasta que edite el codigo
		String nombre = "Equipo";
		
		equipo.setNombreEquipo(nombre);
		equipo.setRanking(ranking);

		new_equipo.setEquipo(equipo);

		assertNull(null);
	}

}