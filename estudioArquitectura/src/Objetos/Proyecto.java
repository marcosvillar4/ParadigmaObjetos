package Objetos;

import java.util.LinkedList;

public class Proyecto {


    String codigo;
    String nombre;
    JefeDeProyecto jefe;

    static LinkedList<JefeDeProyecto> jefes = new LinkedList<>();

    public Proyecto() {
        jefe = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public JefeDeProyecto getJefe() {
        return jefe;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJefe(JefeDeProyecto jefe) {
        if(!jefes.contains(jefe) && this.jefe == null){
            jefes.add(jefe);
            this.jefe = jefe;
        } else if (!jefes.contains(jefe) && this.jefe != null) {
            jefes.remove(this.jefe);
            jefes.add(jefe);
            this.jefe = jefe;
        } else {
            System.out.println("Jefe ya asignado");
        }
    }


}
