import Objetos.Cuenta;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("A", "A", 1, "Caja ahoro");
        Cuenta c2 = new Cuenta("B", "A", 2, "Caja ahoro");
        System.out.println(c1.getSaldo());
        c1.agregarSaldo(10);
        c1.print();
        c1.setInteres(0.5);
        c1.aplicarInteres();
        System.out.println("_____________________");
        c1.print();
        System.out.println("_____________________");

        c2.agregarSaldo(10);

        System.out.println(c1.compararSaldo(c2));

        c2.transferir(c1,10);
        c2.print();
    }





}