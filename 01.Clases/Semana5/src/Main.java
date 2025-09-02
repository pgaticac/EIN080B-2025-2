
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
            ArrayList lista = new ArrayList();
            
            lista.add("uno");
            lista.add(2);
            lista.add(3.0);
            
            System.out.println(lista);
            
            lista.add(0,"cero");
            System.out.println(lista);
            
            lista.remove(2);
            lista.add(2,"dos");
            
            lista.set(3, "tres");
            
            System.out.println(lista);
            System.out.println("Hay " + lista.size() + " elementos");
        
    }
    
}
