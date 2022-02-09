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
