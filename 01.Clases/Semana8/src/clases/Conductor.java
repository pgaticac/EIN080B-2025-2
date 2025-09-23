
package clases;


public class Conductor {
    private String nombre;

    public Conductor() {
    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + '}';
    }
    
    
}
