package Objetos;

public class Circulo extends Figura{
    int radio;

    public Circulo(int radio) {
        this.radio = radio;

        area();
        perimetro();
    }


    @Override
    public void area(){
        area = radio*radio*Math.PI;
    }

    @Override
    public void perimetro(){
        perimetro = Math.PI*2*radio;
    }


}
