package ejer07;

public class main {

	public static void main(String[] args) {
		Mascota m1= new Mascota("Pluto", "Perro");
		Mascota m2= new Mascota("Cuca", "Gato");
		
		m1.jugar();
		m2.jugar();
		m1.mostrar();
		m2.mostrar();
		
		m1.jugar();
		m2.alimentar();
		m1.mostrar();
		m2.mostrar();
		
		m1.jugar();
		m2.jugar();
		m1.mostrar();
		m2.mostrar();

	}

}
