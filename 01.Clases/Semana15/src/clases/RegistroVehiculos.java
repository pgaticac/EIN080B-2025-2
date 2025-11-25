/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author labinf
 */
public abstract class RegistroVehiculos {

    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static void add(Vehiculo v) {
        //Restricciones de reglas de negocio y validaciones

        vehiculos.add(v);
    }
    
    public static ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
    }

}
