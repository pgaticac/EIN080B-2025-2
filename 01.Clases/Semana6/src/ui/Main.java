package ui;

import clases.Perro;
import clases.Vehiculo;

public class Main {

    public static void main(String[] args) {
//       Perro perro = new Perro();
//       perro.color = "negro";
//       perro.nombre = "Frank";
//       
//       Perro perro2 = new Perro();
//       perro2.nombre = "Jeep";
//       perro2.color = "anaranjado";
//       
//       Perro perro3 = perro;
//       perro3.color = "Blanco";
//       perro3.nombre = "Godzilla";
//       
//        System.out.println(perro);
//        System.out.println(perro2);
//        System.out.println(perro3);
//        
//        System.out.println("Perro 1: "+perro.nombre);
//        System.out.println("Perro 2: "+perro2.nombre);
//        System.out.println("Perro 3: "+perro3.nombre);
//        
//        System.out.println(perro.ladrar());

        Vehiculo ferrari = new Vehiculo();
        ferrari.velocidadMax = 300;
        ferrari.velocidad = 0;
        for (int i = 0; i < 32; i++) {
            ferrari.acelerar();
            System.out.println(ferrari.velocidad + " km/hr");
        }

    }

}
