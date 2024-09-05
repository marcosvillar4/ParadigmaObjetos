package Objetos;

public class Lineas {
    int inicio;
    int fin;
    String id;
    double longitud;

    public Lineas(String id, int x, int y) {
        this.id = id;
        this.fin = y;
        this.inicio = x;

        calclongitud();
    }

    void calclongitud(){
        longitud = Math.sqrt((inicio*inicio) + (fin*fin));
    }

    public double getLongitud(){
        return longitud;
    }


}
