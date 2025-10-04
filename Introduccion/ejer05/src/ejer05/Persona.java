package ejer05;
import java.util.Scanner;
public class Persona {
	public String nombre, paterno, materno;
	public int edad, ci;
	
	
	public Persona(String a, String b, String c, int d, int e){
		nombre=a;
		paterno=b;
		materno=c;
		edad=d;
		ci=e;
	}
	
	public String mostarDatos() {
		return "nombre: "+nombre +" paterno: "+paterno+" materno: "+materno+" edad: "+edad+" ci: "+ci+"\n";
		
	}
	
	public String mayorDeEdad(Persona a) {
		if(this.edad> a.edad) {
			return this.nombre+" es mayor de edad que "+a.nombre+"\n";	
		}
		else {
			return a.nombre+" es mayor de edad que "+this.nombre+"\n";
		}
			
	}

	public void modificarEdad(int a) {
			this.edad=a;
		}
	
	public String mismoApellido(Persona a) {
		if(this.paterno== a.paterno) {
			return "Tienen el mismo apellido\n";	
		}
		else {
			return "No tienen el mismo appelido\n";
		}
			
	} 
}

