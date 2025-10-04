package ejer07;

public class Mascota {
	public String nombre,tipo;
	public int energia;
	
	public Mascota(String a, String b) {
		 nombre=a;
		 tipo=b;
		 energia=100;
	}
	
	public void alimentar() {
		energia=energia+20;
		if(energia>=100) {
			energia=100;
		}
		
	}
	
	public void jugar() {
		energia=energia-15;
		if(energia<=0) {
			energia=0;
		}
	}
	public void mostrar() {
		System.out.print("nombre= "+ this.nombre+"\n");
		System.out.print("tipo= "+ this.tipo+"\n");
		System.out.print("energia= "+ this.energia+"\n");
		System.out.print("--------------------------------\n");
	}
	


}
