package ejer01;

public class jefe extends persona{
	public String sucursal, tipo;

	public jefe(String nombre, String apellido, int ci,String sucursal, String tipo) {
		super(nombre, apellido, ci);
		this.sucursal=sucursal;
		this.tipo=tipo;
		
	}

}
