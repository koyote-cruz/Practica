package ejer13;
import java.util.Arrays;

public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] vitaminas;

    
    public Fruta(String nombre, String tipo, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vitaminas = vitaminas;
        this.nroVitaminas = vitaminas.length;
    }

    
    public Fruta(String nombre, String[] vitaminas) {
        this(nombre, "desconocido", vitaminas);
    }

    
    public Fruta(String nombre, String tipo, int nroVitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = nroVitaminas;
        this.vitaminas = new String[nroVitaminas];
        for (int i = 0; i < nroVitaminas; i++) {
            this.vitaminas[i] = "Vitamina" + (i+1);
        }
    }

    public int getNroVitaminas() {
        return nroVitaminas;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getVitaminas() {
        return vitaminas;
    }

    public void mostrarVitaminas() {
        System.out.println("Vitaminas de " + nombre + ": " + Arrays.toString(vitaminas));
    }

    public void ordenarVitaminas() {
        Arrays.sort(vitaminas);
    }

    @Override
    public String toString() {
        return "Fruta: " + nombre + " | Tipo: " + tipo + " | Vitaminas: " + Arrays.toString(vitaminas);
    }
}