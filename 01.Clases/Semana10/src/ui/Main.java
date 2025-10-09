
package ui;

import clases.Animal;
import clases.Perro;

public class Main {

   
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);
        
        Perro perro = new Perro();
        perro.setTipo("perro");
        perro.setNombre("Romeo");
        System.out.println(perro);
    }
    
}
