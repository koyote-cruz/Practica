package ejer05;

public class main {

	public static void main(String[] args) {
		
		
		Bus b1=new Bus("Pedro","414diof",1235698,20,"Copacabana");
		Auto a1=new Auto("Lucas","687hke",4569875,200,false);
		Moto m1=new Moto("Jose","658fjy",1658746,2,true);
		
		System.out.print(b1);
		System.out.print(a1);
		System.out.print(m1);
		
		b1.setConductor("Manuel");
		System.out.print(b1);

	}

}
