package ejer01;

public class cliente extends persona {
	public int nroCompra, idCliente;
	
	
	
	public cliente(String nombre, String apellido, int ci, int nroCompra, int idCliente ) {
		super(nombre, apellido, ci);
		this.nroCompra= nroCompra;
		this.idCliente= idCliente;
		
	}
	
	
	

}
