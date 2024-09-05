package Objetos;

import java.util.LinkedList;

public class Poligono extends Figura {

    int numeroLineas;


    public int getNumerLineas() {
        numeroLineas = lineas.size();
        return this.numeroLineas;
    }

    public void perimetro(){
        for (int i = 0; i < lineas.size() - 1; i++) {
            perimetro = perimetro + lineas.get(i).longitud;
        }
    }

    public void agregarLinea(Lineas l){
        lineas.add(l);
    }

    public void sacarLinea(Lineas l){
        lineas.remove(l);
    }



}
