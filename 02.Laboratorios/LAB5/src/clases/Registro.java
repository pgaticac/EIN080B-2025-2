package clases;

import java.util.ArrayList;

/**
 *
 * @author PGC
 */
public class Registro {

    public ArrayList<Vehiculo> vehiculos;
    public ArrayList<Arriendo> arriendos;
    public ArrayList<Vehiculo> vehiculos;

    public Registro() {
        arriendos = new ArrayList<>();
        vehiculos = new ArrayList<>();
    }

<<<<<<< HEAD
    public void addArriendo(Arriendo arriendo) {
=======
    public void registrarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public void registrarArriendo(Arriendo arriendo) {
>>>>>>> 1f260686fda5a665fafb9d2eac0889a857a77a2c
        arriendos.add(arriendo);
    }

    public void addVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    public ArrayList<Arriendo> getArriendos() {
        return this.arriendos;
    }
    
<<<<<<< HEAD
    public ArrayList<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }
=======
    public ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
    }
    
>>>>>>> 1f260686fda5a665fafb9d2eac0889a857a77a2c

}
