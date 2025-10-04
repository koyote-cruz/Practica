package ejer02;

public class main {
	public static void main(String[] args) {
        
        Videojuego v1 = new Videojuego("FIFA 25", "PlayStation", 2);
        Videojuego v2 = new Videojuego("Minecraft", "PC");

        v1.mostrar();
        v2.mostrar();

        
        Videojuego v3 = new Videojuego("Tetris"); 
        v3.mostrar();

        
        v1.agregarJugadores(); 
        v1.mostrar();

        v2.agregarJugadoresPorTeclado(); 
        v2.mostrar();
    }

}
