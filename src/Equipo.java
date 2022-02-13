
/**
 * Esta clase sirve para crear un equipo
 * @author: Arturo
 * @version: 13/02/2022
 */

public class Equipo {
//	Campos de la clase
	private String nombreEquipo;
	private int ranking;

/**
* Constructor del equipo
*/
	public Equipo () {
		this.setNombreEquipo(nombreEquipo);
		this.setRanking(ranking);
	} // Cierre del constructor

/**
* Metodo que guarda el nombre del equipo
* @param nombreEquipo El parámetro es el String con el nombre del equipo
*/
	public void setNombreEquipo(String nombreEquipo) {
		boolean cumple=true;
		if(nombreEquipo!=null && nombreEquipo.length()>=4&&nombreEquipo.length()<=20){
			
		
		for(int i=0;i<nombreEquipo.length()&&cumple;i++) {
			if(nombreEquipo.toLowerCase().charAt(i)>='a'&&nombreEquipo.toLowerCase().charAt(i)<='z') {
				cumple= true;
			}
			else if(nombreEquipo.charAt(i)==' '){
				cumple=true;
				
			}else {
				cumple=false;
			}
		}
		
		if(cumple) {
			this.nombreEquipo=nombreEquipo;
			
		}else {
			this.nombreEquipo=null;
		}
		
	}
	}

/**
* Metodo que guarda el el ranking del equipo
* @param ranking El parámetro es el int con el cual se decide el ranking
*/
	public void setRanking(int ranking) {

		if(ranking >=0 && ranking <=10) {
			this.ranking=ranking;
		}

		

	}

/**
* Método que devuelve el nombre del equipo
* @return El nombre del equipo
*/
	public String getNombreEquipo() {
		return nombreEquipo;
	}
/**
* Método que devuelve el ranking guardado
* @return El ranking guardado
*/
	public int getRanking() {
		return ranking;
	}

/**
* Método que asigna la categoria al equipo segun el ranking de este
*/
	public String categoriaEquipo() {
	String categoria = "";
	   if(nombreEquipo!=null && ranking!=-1) {
		   if (ranking < 3) {
			   categoria = "tercera";
		   } else if (ranking >= 3 && ranking <= 6) {
				categoria = "segunda";
		   }else if (ranking >= 7 && ranking <= 10) {
			   categoria = "primera";
		   }
	   }
       return categoria;
	}
}
