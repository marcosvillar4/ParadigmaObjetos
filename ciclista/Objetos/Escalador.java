package Objetos;

public class Escalador extends Ciclista{
    float aceleracionPromedio;
    float gradoRampa;

    public Escalador(String nombre, int id) {
        super(nombre, id);
    }
    
    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Aceleracion Promedio: " + aceleracionPromedio);
        System.out.println("Grado Rampa: " + gradoRampa);
    }
}
