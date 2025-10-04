package ejer05;

public class Celular {
	private String nroTel;
    private String dueño;
    private int espacio;   
    private int ram;       
    private int nroApp;

    
    public Celular(String nroTel, String dueño, int espacio, int ram, int nroApp) {
        this.nroTel = nroTel;
        this.dueño = dueño;
        this.espacio = espacio;
        this.ram = ram;
        this.nroApp = nroApp;
    }

    
    public void incrementarApps() {
        nroApp += 10;
    }

    
    public void reducirEspacio() {
        espacio =espacio - 5;
        if (espacio < 0) espacio = 0; 
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nroTel='" + nroTel + '\'' +
                ", dueño='" + dueño + '\'' +
                ", espacio=" + espacio + "GB" +
                ", ram=" + ram + "GB" +
                ", nroApp=" + nroApp +
                '}';
    }

}
