package ejer05;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Persona p1=new Persona("Andres", "Perez", "Choque", 20,1564851);
		Persona p2=new Persona("Jose", "Lopez", "Gallardo", 25,4846516);
		
		System.out.print(p1.mostarDatos());
		System.out.print(p2.mostarDatos());
		System.out.print(p1.mayorDeEdad(p2));
		p2.modificarEdad(20);
		System.out.print(p2.mostarDatos());

	}

}
