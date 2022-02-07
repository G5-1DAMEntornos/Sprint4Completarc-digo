public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {
//		this.setNombreEquipo(nombreEquipo);
//		this.setRanking(ranking);
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		//code here
	}
	public void setRanking(int ranking) {

		//code here
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
	
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
