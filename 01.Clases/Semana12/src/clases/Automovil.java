
package clases;


public class Automovil extends Vehiculo {
    private boolean deLujo;

    public Automovil() {
    }

    public Automovil(String patente, int año, boolean deLujo) {
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
    public float getValorDiario() {
        float valorDiario = super.getValorDiario();
        if (this.isDeLujo()) {
            valorDiario = valorDiario * 3;
        }
        return valorDiario;
    }

    @Override
    public String toString() {
        return "Automovil{" + "patente=" + super.getPatente() + ", año=" + super.getAño() +", deLujo=" + (deLujo?"Si":"No") +  ", valor diario =" + this.getValorDiario() + '}';
     }
    
    
    
    
}
