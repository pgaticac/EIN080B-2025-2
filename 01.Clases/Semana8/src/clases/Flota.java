package clases;

import java.util.ArrayList;

public class Flota {
  private ArrayList<Vehiculo> vehiculos; 

    public Flota() {
        vehiculos = new ArrayList<>();
    }
  
  public void addVehiculo(Vehiculo nuevo){
      //validaciones
      this.vehiculos.add(nuevo);
  }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
  
    public int countFlota(){
        return vehiculos.size();
    }
  
}
