package ui;

import clases.Clinica;
import clases.Dueño;
import clases.Paciente;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Paciente paciente1;

        paciente1 = new Paciente();
        Dueño dueño1 = new Dueño();
        dueño1.setNombre("Juan Perez");

        paciente1.setNombre("Cucha");
        paciente1.setEspecie("Gato");
        paciente1.setRaza("Romano");
        paciente1.setEdad(8);
        paciente1.setDueño(dueño1);

        Dueño dueño2 = new Dueño("111", "Carla Rojas");
        Paciente paciente2 = new Paciente("Frank", "perro", "pug", 1);

        paciente2.setDueño(dueño2);

        Clinica miClinica = new Clinica();
        miClinica.add(paciente1);
        miClinica.add(paciente2);

        //System.out.println("Hay " + miClinica.getPacientes().size() + " pacientes");
        ArrayList<Paciente> pacientes = miClinica.getPacientes();
        
        System.out.println("Hay " + pacientes.size() + " pacientes");
        
        for (Paciente p : miClinica.getPacientes()) {
            System.out.println(p.imprimirDatos());
        }

    }

}
