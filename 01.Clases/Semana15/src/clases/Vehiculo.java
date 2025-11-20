package clases;

public class Vehiculo {

    private String patente;
    private int año;
    public int VALOR_DIARIO = 10000;
    public float IVA = 0.19f;

    public Vehiculo() {
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", a\u00f1o=" + año + '}';
    }

    public Vehiculo(String patente, int año) {
        this.patente = patente;
        this.año = año;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}
