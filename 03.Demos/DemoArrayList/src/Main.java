
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        
        palabras.add("uno");
        palabras.add("dos");
        palabras.add("tres");
        palabras.add("cuatro");
        palabras.add(0,"cero");
        
        
        System.out.println("Total palabras: " + palabras.size());
        System.out.println(palabras);
        
        System.out.println("El primer elemento es: " + palabras.get(0));
        System.out.println(palabras);
        
        System.out.println("El primer elemento era: " + palabras.remove(0));
        System.out.println(palabras);
        
        System.out.println("");
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        Persona p1 = new Persona();
        p1.setNombre("Pedro Parker");
        p1.setEdad(20);
        
        personas.add(p1);
        
        personas.add(new Persona("Antonio Stark",45));
        
        System.out.println(personas);
    }
    
}
