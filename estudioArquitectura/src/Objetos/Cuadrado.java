package Objetos;

public class Cuadrado extends Figura{

    @Override
    public double getArea() {

        if (!lineas.isEmpty()) {
            area = Math.pow(lineas.peek().longitud, 2);
            return area;
        }
        else {
            return 0;
        }

    }
}
