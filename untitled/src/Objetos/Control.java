package Objetos;

import java.util.LinkedList;

public class Control {

    LinkedList<String> Jefes = new LinkedList<>();

    public JefeDeProyecto CrearJefe(String codigo, String nombre, String direccion, String tel){

        if (!Jefes.contains(nombre)){
            JefeDeProyecto Jefe = new JefeDeProyecto(codigo, nombre, direccion, tel);
            Jefes.add(nombre);
            return Jefe;
        }
        else {
            System.out.println("Jefe tiene nombre no unico");

        }

        return null;
    }

}
