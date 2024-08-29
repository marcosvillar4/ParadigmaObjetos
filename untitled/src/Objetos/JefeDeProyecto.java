package Objetos;

public class JefeDeProyecto {

    String codigo;
    String nombre;
    String direccion;
    String tel;

    public JefeDeProyecto(String codigo, String nombre, String direccion, String tel) {
        this.codigo = codigo;


        this.nombre = nombre;

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
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
