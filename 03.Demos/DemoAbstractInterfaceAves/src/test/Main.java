/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import clases.Ave;
import clases.Gaviota;
import clases.Loro;
import clases.Pinguino;

/**
 *
 * @author Alumnos_IBT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Ave a = new Ave();
      Pinguino p = new Pinguino();
      Gaviota g = new Gaviota();
      Loro l = new Loro();
      
      p.nadar();
      g.nadar();
      g.volar();
      l.volar();
      
      
    }
    
}
