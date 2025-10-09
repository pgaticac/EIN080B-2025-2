
package clases;

public class Animal {
    private String tipo;
    private String nombre;
    
    public String hablar(){
        return "";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    @Override
    public String toString() {
        return "Animal: " + this.tipo  +  "\n" +
                this.nombre + "\n" +
                this.hablar();
    }
    
    
}
