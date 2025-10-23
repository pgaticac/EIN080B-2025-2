
package clases;

import java.util.ArrayList;


public class Registro {
    private ArrayList<Arriendo> arriendos;

    public Registro() {
        arriendos = new ArrayList<>();
    }
    
    public void add(Arriendo nuevo){
        arriendos.add(nuevo);
    }
    
    public ArrayList<Arriendo> getArriendos(){
        return this.arriendos;
    }
    
    
}
