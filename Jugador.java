import java.util.Iterator;

public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	public Jugador () {

	}

	public void setNombreJugador(String nombre) {

		if (nombre!=null&&3<nombre.length() && nombre.length()<=20) {


			for(int i = 0 ; i <nombre.length() ; i++) {

				if (!(nombre.toLowerCase().charAt(i)>='a' && nombre.toLowerCase().charAt(i)<='z')){
					this.nombre=null;
				}else {
					this.nombre=nombre;
				}
			}
		}else {
			this.nombre=null;
		}
	}

	public void setEdad(int edad) {

		if (edad>=18 && edad<=100) {

			this.edad=edad;

		} else {
			this.edad=0;}
	}

	public void setIdioma(String idioma) {

		if(idioma!=null) {
		
		if (idioma.equalsIgnoreCase("español")
				|| idioma.equalsIgnoreCase("ingls")
				|| idioma.equalsIgnoreCase("frances")
				|| idioma.equalsIgnoreCase("aleman" )
				|| idioma.equalsIgnoreCase("ingles")
				|| idioma.equalsIgnoreCase("frances")
				|| idioma.equalsIgnoreCase("aleman"))
		{
			this.idioma=idioma;
		}
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

	public String tipoJugador(){
		String tipo=null;

		int edadMinimaJunior = 18;
		int edadMaximaJunior = 24;
		int edadMinimaSenior = 25;
		int edadMaximaSenior = 35;
		int edadMinimaMaster = 36;

		if(edadMinimaJunior <=edad && edad<= edadMaximaJunior){
			tipo="Junior";
		}

		if(edadMinimaSenior <=edad && edad<= edadMaximaSenior){
			tipo="Senior";
		}

		if(edad>= edadMinimaMaster){
			tipo="Master";
		}
		return tipo;
	}

}