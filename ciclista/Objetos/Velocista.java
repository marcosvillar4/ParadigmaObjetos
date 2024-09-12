package Objetos;

public class Velocista extends Ciclista {
    double potenciaPromedio;
    double velocidadPromedio;

    public Velocista(String nombre, int id) {
        super(nombre, id);
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Potencia promedio: " + potenciaPromedio);
        System.out.println("Velocidad promedio: " + velocidadPromedio);
    }
}
