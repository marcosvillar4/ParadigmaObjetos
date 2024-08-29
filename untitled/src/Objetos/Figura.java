package Objetos;

public class Figura {
    String id;
    String nombre;
    String color;
    double area;
    double perimetro;



    public void area(){
        System.out.println("a");

    }

    public void perimetro(){
        System.out.println("a");
    }

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
