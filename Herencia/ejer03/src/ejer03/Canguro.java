package ejer03;

public class Canguro extends Animal{
	public Canguro(String nombre, int edad) {
		super(nombre, edad);
		
	}
	
	public void Desplazase() {
		System.out.print("\n"+nombre+" se desplaza saltando");
	}

}
