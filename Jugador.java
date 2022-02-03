import java.util.Iterator;

public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	public Jugador () {
		
	}

	public void setNombreJugador(String nombre) {

		if (nombre.length()>3 && nombre.length()<=20) {
			this.nombre=nombre;

			for(int i = 0 ; i <nombre.length() ; i++) {

				if (!(nombre.toLowerCase().charAt(i)>='a' && nombre.toLowerCase().charAt(i)<='z')){
					this.nombre=null;
				}
			}
		}
	}

	public void setEdad(int edad) {

		if (edad>=18 && edad<=100) {

			this.edad=edad;	

		} else { 
			this.edad=0;}
	}

	public void setIdioma(String idioma) {
		
		if (idioma.equalsIgnoreCase("espa�ol")  || idioma.equalsIgnoreCase("ingl�s")|| idioma.equalsIgnoreCase("franc�s")|| idioma.equalsIgnoreCase("alem�n" )
				|| idioma.equalsIgnoreCase("ingles")|| idioma.equalsIgnoreCase("frances")|| idioma.equalsIgnoreCase("aleman")) {
			this.idioma=idioma;

		} else {
			this.idioma=null;
		}
	}

	public String getIdioma() {
		return idioma;
	}
	public String getNombreJugador() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
}
