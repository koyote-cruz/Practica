package ejer03;

public class Animal {
	protected int edad;
	protected String nombre;
	
	public Animal(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
		
	}
	
	public void Desplazase() {
		System.out.print("\n"+nombre+" se desplaza indefinidamente");
	}

}
