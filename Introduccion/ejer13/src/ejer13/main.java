package ejer13;

public class main {
    public static void main(String[] args) {
       
        Fruta f1 = new Fruta("Kiwi", "Subtropical", new String[]{"C", "E", "K"});
        Fruta f2 = new Fruta("Naranja", new String[]{"A", "C"});
        Fruta f3 = new Fruta("Manzana", "Templado", 3);

       
        Fruta mayor = f1;
        if (f2.getNroVitaminas() > mayor.getNroVitaminas()) mayor = f2;
        if (f3.getNroVitaminas() > mayor.getNroVitaminas()) mayor = f3;
        System.out.println("Fruta con más vitaminas: " + mayor.getNombre());

        
        f1.mostrarVitaminas();

        
        int citricas = 0;
        for (String v : f2.getVitaminas()) {
            if (v.equalsIgnoreCase("A") || v.equalsIgnoreCase("C")) citricas++;
        }
        System.out.println("Vitaminas cítricas en " + f2.getNombre() + ": " + citricas);

        
        System.out.println("\nVitaminas antes de ordenar:");
        f1.mostrarVitaminas();
        f1.ordenarVitaminas();
        System.out.println("Vitaminas después de ordenar:");
        f1.mostrarVitaminas();
    }
}
