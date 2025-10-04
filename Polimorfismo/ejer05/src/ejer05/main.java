package ejer05;

public class main {
	public static void main(String[] args) {
        
        Celular c1 = new Celular("78965412", "Juan Perez", 64, 4, 20);

        System.out.println("Datos iniciales:");
        System.out.println(c1);

        
        c1.incrementarApps();

        
        c1.reducirEspacio();

        System.out.println("\n Después de aplicar operadores: ");
        System.out.println(c1);
    }

}
