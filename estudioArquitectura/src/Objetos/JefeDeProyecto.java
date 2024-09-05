package Objetos;

import java.util.LinkedList;

public class JefeDeProyecto {

    String codigo;
    String nombre;
    String direccion;
    String tel;

    static LinkedList<String> nombres = new LinkedList<>();

    public JefeDeProyecto(String codigo, String direccion, String tel) {
        this.codigo = codigo;
        this.nombre = null;
        this.direccion = direccion;
        this.tel = tel;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        if (!nombres.contains(nombre) && this.nombre == null){
            this.nombre = nombre;
            nombres.add(nombre);
        } else if (!nombres.contains(nombre) && this.nombre != null){
            nombres.remove(this.nombre);
            nombres.add(nombre);
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no unico");
        }
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
