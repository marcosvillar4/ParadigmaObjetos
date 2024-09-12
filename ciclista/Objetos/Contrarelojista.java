package Objetos;

public class Contrarelojista extends Ciclista{
    double velocidadMaxima;

    public Contrarelojista(String nombre, int id) {
        super(nombre, id);
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Velocidad Maxima: " + velocidadMaxima);
    }
}
