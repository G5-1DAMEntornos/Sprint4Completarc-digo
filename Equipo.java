public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo (String nombreEquipo, int ranking) {
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
}
	public String categoriaEquipo(String categoria, String primera,String segunda, String tercera) {


		if(ranking>=7 && ranking<=10) {
			categoria=primera;
		}else if(ranking<=6 && ranking>=3){
			categoria=segunda;

		}
		categoria=tercera;

		if(nombreEquipo!=null && ranking!=0) {
			return categoria;
		}

		return "error";

	}

}
