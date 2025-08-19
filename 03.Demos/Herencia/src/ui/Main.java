
package ui;

import clases.Animal;
import clases.Gato;
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
      Perro perro1 = new Perro();
      perro1.setNombre("Frank");
      perro1.setEdad(1);
      perro1.setColor("blanco");
      
      Gato gato1 = new Gato();
      Animal a = new Animal();
      
      
        System.out.println(perro1);
        System.out.println(perro1.comunicarse());
        System.out.println(gato1.comunicarse());
    }
    
}
