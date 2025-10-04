package ejer03;

public class Pinguino extends Animal {

	public Pinguino(String nombre, int edad) {
		super(nombre, edad);
		
	}
	
	
	public void Desplazase() {
		System.out.print("\n"+nombre+" se desplaza nadando");
	}
}
