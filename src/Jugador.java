/**
 *Esta clase sirve para crear un jugador
 * @author: Equipo5
 * @version: 14/02/2022 
 */

public class Jugador {
    private String nombre;
    private int edad;
    private String idioma;

    /**
     *Contructor de Jugador 
     */
    public Jugador () {

    }
    
    /**
     * Metodo que asigna un nombre al Jugador
     * @param nombre. String de nombre del Jugador
     */
    public void setNombreJugador(String nombre) {
    	
        if (nombre!=null || nombre==""){
            if(3<nombre.length() && nombre.length()<=20) {
                for(int i = 0 ; i <nombre.length() ; i++) {
                    if (!(nombre.toLowerCase().charAt(i)>='a' && nombre.toLowerCase().charAt(i)<='z')){
                        this.nombre=null;
                    }else {
                        this.nombre=nombre;
                    }
                }
            }
        
        }else {
            this.nombre=null;
        }
    }
    
    /**
     * Metodo que asigna una Edad al Jugador
     * @param edad. Int de edad del Jugador
     */
    public void setEdad(int edad) {
    	
        if (edad>=18 && edad<=100) {

            this.edad=edad;

        } else {
            this.edad=0;}
    }
    
    /**
     * Metodo que asigna un idioma al Jugador
     * @param idioma. String de nombre del Jugador
     */
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

    /**
     * Metodo que devuelve el Idioma de Jugador
     * @return Idioma de Jugador
     */
    public String getIdioma() {
        return idioma;
    }
    
    /**
     * Metodo que devuelve el nombre del Jugador
     * @return nombre de Jugador
     */
    public String getNombreJugador() {
        return nombre;
    }
    
    /**
     * Metodo que devuelve la edad de Jugador
     * @return edad de Jugador
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Metodo que devuelve la categoria de Jugador
     * @return categoria de Jugador
     */
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
