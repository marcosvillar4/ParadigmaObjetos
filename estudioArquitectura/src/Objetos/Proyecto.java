package Objetos;

public class Proyecto {


    String codigo;
    String nombre;
    JefeDeProyecto jefe;


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

    protected void setJefe(JefeDeProyecto jefe) {
        this.jefe = jefe;
    }
}
