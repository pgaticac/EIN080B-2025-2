package clases;

import java.util.ArrayList;

/**
 *
 * @author PGC
 */
public class Registro {

    public ArrayList<Arriendo> arriendos;

    public Registro() {
        arriendos = new ArrayList<>();
    }

    public void add(Arriendo arriendo) {
        arriendos.add(arriendo);
    }

    public ArrayList<Arriendo> getArriendos() {
        return this.arriendos;
    }

}
