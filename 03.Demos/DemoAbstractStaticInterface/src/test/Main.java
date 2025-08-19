/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import clases.Animal;
import clases.Gato;
import clases.Hablador;
import clases.Perro;

/**
 *
 * @author Alumnos_IBT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //  Animal a = new Animal();
        Perro p = new Perro();
        Animal perro = new Perro();
        Gato gato = new Gato();
        
      //  System.out.println(a.emitirSonido());
        System.out.println(p.emitirSonido());
        System.out.println(gato.emitirSonido());
    }
    
}
