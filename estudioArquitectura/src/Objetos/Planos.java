package Objetos;

import java.io.File;
import java.util.LinkedList;

public class Planos {
    int NumeroID;
    String Fecha;
    LinkedList<String> Arquitectos;
    File Dibujo;
    int NumeroFiguras = 0;
    LinkedList<Figura> Figuras;

    public int getNumeroID() {
        return NumeroID;
    }

    public void agregarFigura(Figura fig){
        Figuras.add(fig);
        NumeroFiguras++;
    }

    public void sacarFigura(Figura fig){
        Figuras.remove(fig);
        NumeroFiguras--;
    }

    public void agregarArquitecto(String nombre){
        Arquitectos.add(nombre);
    }

    public void sacarArquitecto(String nombre){
        Arquitectos.remove(nombre);
    }

    public void setNumeroID(int numeroID) {
        NumeroID = numeroID;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public File getDibujo() {
        return Dibujo;
    }

    public void setDibujo(File dibujo) {
        Dibujo = dibujo;
    }
}
