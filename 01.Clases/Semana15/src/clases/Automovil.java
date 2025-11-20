

package clases;

public class Automovil extends Vehiculo{
    private boolean deLujo;

    public Automovil() {
    }

    public Automovil(boolean deLujo, String patente, int año) {
        super(patente, año);
        this.deLujo = deLujo;
    }

    public boolean isDeLujo() {
        return deLujo;
    }

    public void setDeLujo(boolean deLujo) {
        this.deLujo = deLujo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "deLujo=" + deLujo + '}';
    }
    
    
    
}
