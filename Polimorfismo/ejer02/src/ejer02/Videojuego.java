package ejer02;
import java.util.Scanner;
public class Videojuego {
	private String nombre, plataforma;
	private int jugadores;
	
	
	public Videojuego(String a, String b, int c) {
		nombre =a;
		plataforma=b;
		jugadores=c;
		
	}
	
	public Videojuego(String a, String b) {
		nombre =a;
		plataforma=b;
		jugadores=1;
		
	}
	
	public Videojuego(String a) {
		nombre =a;
		plataforma="Desconocido ";
		jugadores=1;
		
	}
	
	public void mostrar() {
        System.out.println("\nVideojuego : " + nombre + " Plataforma: " + plataforma + " Jugadores: " + jugadores);
    }
	
	public void agregarJugadores() {
		jugadores= jugadores+1;
		
	}
	
	 public void agregarJugadoresPorTeclado() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Ingrese cantidad de jugadores a agregar: ");
	        int n = sc.nextInt();
	        jugadores = jugadores + n;
	    }

}
