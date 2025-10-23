package ui;

import clases.Arriendo;
import clases.Automovil;
import clases.Vehiculo;
import clases.Minibus;
import clases.Registro;


public class Main {

 
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("AAAA11",2020);
        Automovil a1 = new Automovil("BBBB11",2000,false);  //Auto normal
        Automovil a2 = new Automovil("CCCC11",2025,true); //Automovil de lujo
        Minibus m1 = new Minibus("DDDD22",2023,10);
        
        Arriendo ar1 = new Arriendo();
        ar1.setVehiculo(a1);
        ar1.setDias(5);
        
        Arriendo ar2 = new Arriendo();
        ar2.setVehiculo(a2);
        ar2.setDias(5);
        
        Arriendo ar3 = new Arriendo();
        ar3.setVehiculo(new Minibus("EEEE33",2020,10));
        ar3.setDias(5);
        
        Registro pam = new Registro();
        pam.add(ar1);
        pam.add(ar2);
        pam.add(ar3);
        
        
        System.out.println(v1);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(m1);
        
        System.out.println("\nArriendos PAM");       
        for (Arriendo arriendo : pam.getArriendos()) {
            System.out.println(arriendo);
        }
  
  
    }
    
}
