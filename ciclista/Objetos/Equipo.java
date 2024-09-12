package Objetos;

public class Equipo {

    Ciclista[] lista = new Ciclista[10];
    String nombre;
    int id;
    private int index = 0;

    public Equipo(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciclista[] getLista() {
        return lista;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void printDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
    }

    public int tiempoTotal(){
        int contador = 0;
        for (Ciclista ciclista : lista) {
            if (ciclista != null) {
                contador = contador + ciclista.getTiempo();
            }
        }
        return contador;
    }

    public void nombres(){
        for (Ciclista ciclista : lista) {
            if (ciclista != null) {
                System.out.println(ciclista.getNombre());
            }
        }
    }

    public void buscarID(int id){
        for (Ciclista ciclista : lista) {
            if (ciclista != null) {
                if (ciclista.getId() == id){
                    ciclista.imprimirDatos();
                }
            }
        }
    }

    public void agregarCiclista(Ciclista c){
        if (index < 10){
            lista[index] = c;
            index++;
        }
    }
}
