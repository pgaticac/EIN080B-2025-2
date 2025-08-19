package clases;

public class Paciente {

    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private Dueño dueño;

    //Constructor por defecto
    public Paciente() {
        this.dueño = new Dueño();
    }

    //Constructor personalizado
    public Paciente(String nombre, String especie, String raza, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.dueño = new Dueño();
    }
    
    //accesador / getter
    public int getEdad() {
        return this.edad;
    }
    
    //mutador / setter
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
    
    
    
    //Métodos de Negocio
    public String imprimirDatos(){
        String datos = "\nFicha Paciente\nNombre: " + this.nombre +
                       "\nEspecie: "+ this.especie +
                       "\nRaza: "+ this.raza +
                       "\nEdad: "+ this.edad +
                       "\nDueño: "+ this.dueño.getNombre();
                
        
        return datos;
    }
}
