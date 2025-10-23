
package clases;

public class Vehiculo {
    private String patente;
    private int año;
    public int VALOR_DIARIO = 10000;
    public float IVA = 0.19f;

    public Vehiculo() {
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
        if(año <= 2023){
        this.año = año;
        }else{
            //?
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", año=" + año +  ", valor diario =" + this.getValorDiario() + '}';
    }
    
    
    public float getValorDiario(){
        float valorConIVA = this.VALOR_DIARIO + this.VALOR_DIARIO * this.IVA;
        return valorConIVA;
    }
    
    
}
