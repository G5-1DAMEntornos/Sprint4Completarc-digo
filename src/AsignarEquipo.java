import java.util.Objects;

/**
 * Esta clase sirve para asignar un equipo usando un equipo y un jugador
 * @author: Arturo
 * @version: 13/02/2022
 */

public class AsignarEquipo {
//	Campos de la clase
	private Equipo equipo;
	private Jugador jugador;

/**
* Constructor de asignar equipo
*/
	public AsignarEquipo() {
		   	  this.setEquipo(equipo);
		   	  this.setJugador(jugador);

	} // Cierre del constructor
/**
* Método que guarda el equipo
* @param equipo El parámetro es el equipo que guardamos en la clase
*/
	public void setEquipo(Equipo equipo) {
		if (equipo!=null && equipo.getNombreEquipo()!=null && equipo.getRanking()>=0){
			this.equipo=equipo;            
		}
	}
/**
* Método que guarda el jugador
* @param jugador El parámetro es el jugador que guardamos en la clase
*/
	public void setJugador(Jugador jugador) {
		if(jugador!=null && jugador.getNombreJugador()!=null && jugador.getEdad()>=0 && jugador.getIdioma()!=null)  {
			this.jugador=jugador;
		}
	}
/**
* Método que devuelve el equipo guardado
* @return El equipo guardado
*/
	public Equipo getEquipo(){
		return equipo;
	}
/**
* Método que devuelve el jugador guardado
* @return El jugador guardado
*/
	public Jugador getJugador(){
		return jugador;
	}
} //Cierre de la clase
