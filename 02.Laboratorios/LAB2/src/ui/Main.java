package ui;

import clases.Pasaje;
import clases.Pasajero;


public class Main {

 
    public static void main(String[] args) {
        Pasajero pa = new Pasajero();
        pa.setRut("1111111-1");
        pa.setNombre("Pedro Parker");
        pa.setEdad(25);
        pa.setTelefono(987456321);
        
        Pasaje pasaje = new Pasaje();
        pasaje.setNumeroAsiento(20);
        pasaje.setTipoServicio("Snack");
        pasaje.setPasajero(pa);
        
        System.out.println(pasaje.imprimir());
    }
    
}
