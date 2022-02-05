import java.util.Iterator;

public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	public Jugador () {
		
	}

	public void setNombreJugador(String nombre) {

		if (3<nombre.length() && nombre.length()<=20) {
			

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
		
		if (idioma.equalsIgnoreCase("español")  || idioma.equalsIgnoreCase("inglés")|| idioma.equalsIgnoreCase("francés")|| idioma.equalsIgnoreCase("alemán" )
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
	
	 public String tipoJugador(int edad){
        int ed=edad;
        String tipo=null;
        
            if(18<=ed && ed<=24){
                tipo="Junior";
            }
            if(25<=ed && ed<=35){
            	tipo="Senior";
            }
            if(ed>35){
            	tipo="Master";
            }
        return tipo;
    }
	
}