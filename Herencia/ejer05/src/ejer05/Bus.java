package ejer05;

public class Bus extends Vehiculo{
	public int capacidad;
	public String sindicato;

	public Bus(String conductor, String placa, int id, int capacidad, String sindicato) {
		super(conductor, placa, id);
		this.capacidad=capacidad;
		this.sindicato=sindicato;
		
	}
	
	public void setConductor(String x){
		super.conductor=x;
	}
	public String toString() {
		return super.toString()+"\n"+" capacidad: "+capacidad+ " sindicato: "+sindicato ;
	}

}
