package Objetos;

public class Cuadrado extends Figura{

    @Override
    public double getArea() {
        area = Math.pow(lineas.peek().longitud, 2);
        return area;
    }
}
