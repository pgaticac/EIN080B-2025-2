/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Alumnos_IBT
 */
public class Gaviota extends Ave implements Nadador, Volador {

    @Override
    public void nadar() {
        System.out.println("nado como gaviota");
    }

    @Override
    public void volar() {
        System.out.println("vuelo como gaviota");
    }

}
