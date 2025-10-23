
package clases;

public class Minibus extends Vehiculo {
    private int capacidad; 

    public Minibus() {
    }

    public Minibus(String patente, int año, int capacidad) {
        super(patente, año);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public float getValorDiario() {
        return super.getValorDiario()+(500*this.capacidad); 
    }

    @Override
    public String toString() {
            return "Minibus{" + "patente=" + super.getPatente() + ", año=" + super.getAño() +", capacidad=" + this.capacidad +  ", valor diario =" + this.getValorDiario() + '}';
    }
    
    
    
    
    
    
    
    
}
