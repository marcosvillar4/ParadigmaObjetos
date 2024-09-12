package Objetos;

abstract class Ciclista {
    private int id;
    private String nombre;
    private int tiempo;

    public String imprimirTipo(){
        return "Es un: " + this.getClass().getSimpleName();
    }

    public Ciclista(String nombre, int id) {
        this.tiempo = 0;
        this.nombre = nombre;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    void imprimirDatos(){
        System.out.println("ID: " + id);
        System.out.println("Tiempo: " + tiempo);
        System.out.println("Nombre: " + nombre);
    }
}
