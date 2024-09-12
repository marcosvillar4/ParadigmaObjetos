package Objetos;

public class Circulo extends Figura{
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
        area();
        perimetro();
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void area(){
        area = radio*radio*Math.PI;
    }


    public void perimetro(){
        perimetro = Math.PI*2*radio;
    }


}
