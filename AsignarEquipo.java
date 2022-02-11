import java.util.Objects;

public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;


	public AsignarEquipo() {
		   	  this.setEquipo(equipo);
		   	  this.setJugador(jugador);

	}
	public void setEquipo(Equipo equipo) {
		if (equipo!=null && equipo.getNombreEquipo()!=null && equipo.getRanking()>=0){
			this.equipo=equipo;            
		}
	}

	public void setJugador(Jugador jugador) {
		if(jugador!=null && jugador.getNombreJugador()!=null && jugador.getEdad()>=0 && jugador.getIdioma()!=null)  {
			this.jugador=jugador;
		}
	}



	public Equipo getEquipo(){
		return equipo;
	}

	public Jugador getJugador(){
		return jugador;
	}
}
