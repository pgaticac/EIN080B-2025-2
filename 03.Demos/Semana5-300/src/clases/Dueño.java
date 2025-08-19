
package clases;

public class Dueño {
    private String rut;
    private String nombre;

    public Dueño() {
        this.nombre = "N.N";
    }

    public Dueño(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
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
    
    
}
