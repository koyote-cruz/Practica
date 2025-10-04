package ejer05;

public class Auto extends Vehiculo{

	public int caballosfuerza;
	public boolean descapotable;

	public Auto(String conductor, String placa, int id, int caballosfuerza, boolean descapotable) {
		super(conductor, placa, id);
		this.caballosfuerza=caballosfuerza;
		this.descapotable=descapotable;
		
	}
	
	public void setConductor(String x){
		super.conductor=x;
	}
	public String toString() {
		return super.toString()+"\n"+" caballosfuerza: "+ caballosfuerza+ " descapotable: "+descapotable ;
	}


}
