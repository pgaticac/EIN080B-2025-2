
package ui;
import clases.Conductor;
import clases.Vehiculo;

public class Main {

    public static void main(String[] args) {
        Vehiculo ferrari = new Vehiculo(300);
        // auto1.patente = "AAAA88";
        ferrari.setPatente("JJJJ88");
              
        Vehiculo morning = new Vehiculo(120);
        morning.setMarca("Kia");
        morning.setModelo("Morning");
        morning.setPatente("JJJJ88");
        
        Conductor c1 = new Conductor();
        c1.setNombre("Bruno");
        
        morning.setConductor(c1);
        
        System.out.println("Ferrari:" + ferrari.getVelocidadMax());
        System.out.println("Morning:" + morning.getVelocidadMax());
        
        System.out.println(ferrari.getVelocidad());
        System.out.println(morning.getVelocidad());
        
        System.out.println(morning);
    }
    
}
