package clases;

public class Perro extends Animal{

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + super.getNombre() + ", edad=" + super.edad + ", color=" + super.color + '}';
    }

    @Override
    public String comunicarse() {
        return "Guau!";
    }
    
    
}
