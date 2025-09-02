
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author labinf
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        int fil = 5;
        int col = 5;
        Random rand = new Random();
        
        int[][] matriz = new int[fil][col];
       
        for (int f = 0; f < fil; f++) {
            for (int c = 0; c < col; c++) {
                matriz[f][c] = 10+ rand.nextInt(90);
            }
        }
        
        for (int f = 0; f < fil; f++) {
            for (int c = 0; c < col; c++) {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.print("\n");
        }
        
        
    }
}
