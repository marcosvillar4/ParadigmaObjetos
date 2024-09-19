package Objetos;

public class Cuenta {
    private String nombreCuenta;
    private String apellidoCuenta;
    private int numeroCuenta;
    private String tipoCuenta;
    private double saldo;

    private double interes;

    private boolean activa;
    int[] valores = new int[10];

    public Cuenta(String nombreCuenta, String apellidoCuenta, int numeroCuenta, String tipoCuenta) {
        this.nombreCuenta = nombreCuenta;
        this.apellidoCuenta = apellidoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
        this.interes = 0;
        this.activa = true;
    }

    public void print(){
        System.out.println("Nombre: " + nombreCuenta);
        System.out.println("Apellido: " + apellidoCuenta);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void agregarSaldo(int cant){
        saldo = saldo + cant;
        if (this.saldo > 0){
            activa = true;
        }
    }

    public void retirar(int cant){
        if (activa) {
            if (cant >= saldo){
                saldo = saldo - cant;
            } else {
                System.out.println("Saldo insuficiente");
            }

            if (this.getSaldo() == 0){
                activa = false;
            }
        }
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void aplicarInteres(){
        if (activa) {
            saldo = saldo + saldo * interes;
        }
    }

    public boolean compararSaldo (Cuenta c){
        return (c.getSaldo() < this.getSaldo());
    }

    public void transferir (Cuenta c, int cant){
        if (activa) {
            if (cant <= saldo){
                c.agregarSaldo(cant);
                this.retirar(cant);
            }
        }
    }
}
