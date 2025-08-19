
package clases;

import java.util.ArrayList;

public class Clinica {
    private ArrayList<Paciente> pacientes;

    public Clinica() {
        pacientes = new ArrayList<>();
    }
    
    public void add(Paciente p){
       pacientes.add(p);
    }
    
    public ArrayList<Paciente> getPacientes(){
        return pacientes;
    }
    
 
}
