package Objetos;

public class Poligono extends Figura {

    int numeroLineas;
    Lineas[] lineas = new Lineas[10];

    @Override
    public int perimetro(){
        System.out.println("B");
        return 0;
    }

    @Override
    public int area() {

        System.out.println("B");

        return super.area();
    }


}
