package Objetos;

import java.util.LinkedList;

public class Control {

    LinkedList<String> Jefes = new LinkedList<>();

    LinkedList<JefeDeProyecto> JefesEnUso = new LinkedList<>();

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

    public void AsignarJefe(JefeDeProyecto jefe, Proyecto proyecto){
        if(!JefesEnUso.contains(jefe)){
            proyecto.setJefe(jefe);
            JefesEnUso.add(jefe);
        }
    }

    public void SacarJefe(JefeDeProyecto jefe, Proyecto proyecto){
        if(proyecto.getJefe() == jefe){
            proyecto.setJefe(null);
            JefesEnUso.remove(jefe);
        }
    }

}
