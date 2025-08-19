package clases;

public class Pasajero {

    private String rut;
    private String nombre;
    private int edad;
    private int telefono;

    public Pasajero() {
    }

    public Pasajero(String rut, String nombre, int edad, int telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String imprimir() {
        String datos = "Pasajero: \nNombre: " + this.nombre
                + "\nRut: " + this.rut
                + "\nEdad: " + this.edad
                + "\nTelefono: " + this.telefono;

        return datos;
    }
}
