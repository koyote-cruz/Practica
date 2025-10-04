package ejer03;

public class Matriz {
	private float[][] matriz;
    private int n; 

    
    public Matriz(int n) {
        this.n = n;
        matriz = new float[n][n];
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1; 
        }
    }

    
    public Matriz(float[][] valores) {
        this.n = valores.length;
        matriz = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = valores[i][j];
            }
        }
    }


    public Matriz sumar(Matriz m) {
        if (this.n != m.n) {
            throw new IllegalArgumentException("Las matrices deben ser de la misma dimensión");
        }
        float[][] resultado = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = this.matriz[i][j] + m.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }


    public Matriz restar(Matriz m) {
        if (this.n != m.n) {
            throw new IllegalArgumentException("Las matrices deben ser de la misma dimensión");
        }
        float[][] resultado = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = this.matriz[i][j] - m.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }


    
    
    public boolean igual(Matriz m) {
        if (this.n != m.n) return false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (this.matriz[i][j] != m.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    
    
    
    public void mostrar() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
