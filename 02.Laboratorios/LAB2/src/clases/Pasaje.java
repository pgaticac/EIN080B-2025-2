package clases;

public class Pasaje {
    private int numeroAsiento;
    private String tipoServicio;
    private Pasajero pasajero;

    public Pasaje() {
        this.pasajero = new Pasajero();
    }

    public Pasaje(int numeroAsiento, String tipoServicio, Pasajero pasajero) {
        this.numeroAsiento = numeroAsiento;
        this.tipoServicio = tipoServicio;
        this.pasajero = pasajero;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
    public String imprimir(){
        String datos =  "Pasaje: \nNumero Asiento:" + this.numeroAsiento +
                        " \nServicio: " + this.tipoServicio +
                        "\n" + this.pasajero.imprimir();
        return datos;
    }
    
}
