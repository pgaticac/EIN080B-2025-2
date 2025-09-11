package clases;

public class Vehiculo {

    private String patente;
    private String marca;
    private String modelo;
    public float velocidad;
    private byte marcha;
    public float velocidadMax;
    private byte marchaMaxima;
    private Conductor conductor;

    public void acelerar() {
        if(this.velocidad < this.velocidadMax - 10){
            this.velocidad += 10;
        }else{
            this.velocidad = this.velocidadMax;
        }
    }

}
