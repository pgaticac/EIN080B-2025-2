import java.util.Scanner;

public class Main {
    //psvm
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nombre;
        int n1, n2, suma;
        
        //sout
        System.out.println("Hola Mundo");
        System.out.print("Cual es tu nombre?: ");
        nombre = read.next();
        
        System.out.println("Hola "+ nombre);
        
        System.out.print("Ingresa un numero:");
        n1 = read.nextInt();
        System.out.print("Ingresa otro numero: ");
        n2 = read.nextInt();
        
        suma = n1 + n2;
        System.out.println("La suma es: " + suma);
    }
}
