package ejer03;

public class main {
	public static void main(String[] args) {
        Matriz identidad = new Matriz(3);
        System.out.println("Matriz identidad: ");
        identidad.mostrar();

        // b) Matriz personalizada
        float[][] valores = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Matriz m1 = new Matriz(valores);
        System.out.println("\nMatriz m1:");
        m1.mostrar();

        
        float[][] valores2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        Matriz m2 = new Matriz(valores2);

        
        
        Matriz suma = m1.sumar(m2);
        System.out.println("\nSuma:");
        suma.mostrar();

        
        
        Matriz resta = m1.restar(m2);
        System.out.println("\nResta:");
        resta.mostrar();

      
        
        System.out.println("\n¿m1 es igual a m2? " + m1.igual(m2));
    }

}
