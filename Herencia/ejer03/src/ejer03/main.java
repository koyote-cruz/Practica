package ejer03;

public class main {

	public static void main(String[] args) {


		Animal[] animales = new Animal[3];
		
		animales[0] = new Leon("Simba", 5);
        animales[1] = new Pinguino("Pingu", 3);
        animales[2] = new Canguro("Kanga", 4);
        
        for (Animal a : animales) {
            a.Desplazase();
        }

	}

}
