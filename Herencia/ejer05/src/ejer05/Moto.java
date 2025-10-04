package ejer05;

public class Moto extends Vehiculo{
	
	public int cilindrada;
	public boolean casco;

	public Moto(String conductor, String placa, int id, int cilindrada, boolean casco) {
		super(conductor, placa, id);
		this.cilindrada=cilindrada;
		this.casco=casco;
		
	}
	
	public void setConductor(String x){
		super.conductor=x;
	}
	public String toString() {
		return super.toString()+"\n"+" cilindrada: "+cilindrada+ " casco: "+casco ;
	}

}
