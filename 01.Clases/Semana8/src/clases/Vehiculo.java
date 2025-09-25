package clases;

public class Vehiculo {

    private String patente;
    private String marca;
    private String modelo;
    private float velocidad;
    private byte marcha;
    private float velocidadMax;
    private byte marchaMaxima;
    private Conductor conductor;

    public Vehiculo() {
        this.velocidad = 1;
        this.marcha = 1;
    }

    public Vehiculo(float velocidadMax) {
        this.velocidad = 1;
        this.marcha = 1;
        this.velocidadMax = velocidadMax;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        //Validaciones

        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public byte getMarcha() {
        return marcha;
    }

    public void setMarcha(byte marcha) {
        this.marcha = marcha;
    }

    public float getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(float velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public byte getMarchaMaxima() {
        return marchaMaxima;
    }

    public void setMarchaMaxima(byte marchaMaxima) {
        this.marchaMaxima = marchaMaxima;
    }

    @Override
    public String toString() {
        return "patente=" + patente + "\n marca=" + marca + "\n modelo=" + modelo + "\n velocidad=" + velocidad + "\n marcha=" + marcha + "\n velocidadMax=" + velocidadMax + "\n marchaMaxima=" + marchaMaxima + "\n conductor=" + conductor.getNombre() + " " + conductor.getApellido();
    }

   
    
}
