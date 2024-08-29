package Objetos;

import java.util.Date;
import java.util.LinkedList;

public class Figura {
    String id;
    String nombre;
    String color;
    double area;
    double perimetro;
    LinkedList<Lineas> lineas = new LinkedList<>();


    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
