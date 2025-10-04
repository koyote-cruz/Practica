package ejer03;
import java.util.Scanner;
public class Producto {
	public double precio;
	public int stock;
	public String nombre;
	
	
	public Producto(){
		precio=5;
		stock=20;
		nombre="Eduardo";
	}
	
	public String Vender(int a){
		stock=stock-a;
		return "se vende " + a + " por lo que en el stock es: "+stock+"\n";
	}
	public String Restablecer(int a){
		stock=stock+a;
		return "se reestablece " + a + " por lo que en el stock es: "+stock+"\n";
	}
	
	public String toString(){
		return "nombre: "+nombre+" precio: "+precio+" stock: "+stock+"\n";
	}

}
