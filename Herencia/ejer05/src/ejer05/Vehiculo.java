package ejer05;

public class Vehiculo {
	public String conductor, placa;
	public int id;
	
	public Vehiculo(String conductor, String placa, int id) {
		this.conductor=conductor;
		this.placa=placa;
		this.id=id;
		
	}
	
	public void setConductor(String x){
		this.conductor=x;
	}
	public String toString() {
		return "\n"+" conductor: "+conductor+ " placa: "+placa+ " id: "+id ;
	}

}
