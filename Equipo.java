public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {
//		this.setNombreEquipo(nombreEquipo);
//		this.setRanking(ranking);
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		boolean cumple=true;
		if(nombreEquipo.length()>=4&&nombreEquipo.length()<=20){
			
		
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
	public void setRanking(int ranking) {
		if(ranking >=0 && ranking <=10) {
			this.ranking=ranking;
		}
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
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
