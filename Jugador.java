class Jugador {
    private String nombre;
    private int edad;
    private String idioma;


    public void setNombreJugador(String nombre) {
       this.nombre=nombre;
    }

    public void setEdad(int edad) {
    	 this.edad=edad;
    }
    public void setIdioma(String idioma) {
    	this.idioma=idioma;
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