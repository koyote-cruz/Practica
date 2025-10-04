package ejer02;

public class Bus {
	public int asientos_vacios;
	public int pasajeros;
	
	public Bus(int a) {
		asientos_vacios=20;
		pasajeros=a;
		
	}
	public double cobrar() {
		return pasajeros * 1.50;
	}
	public double Asientos() {
		if(asientos_vacios - pasajeros<=0) {
			return 0;
		}
		else {
			return asientos_vacios - pasajeros;
		}
	}
	public String toString() {
		return "BUS\n"+"EXISTEN"+this.asientos_vacios+"Asientos Vacios\n"+"Suben"+this.pasajeros+"Pasajeros\n"+"en total se cobra"+this.cobrar()+"Bs\n"+"Sobran"+this.Asientos()+"Asientos\n";
	}

}
