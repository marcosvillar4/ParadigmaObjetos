import Objetos.Contrarelojista;
import Objetos.Equipo;
import Objetos.Escalador;
import Objetos.Velocista;

public class Main {
    public static void main(String[] args){
        Velocista v1 = new Velocista("AAAA", 1);
        Escalador v2 = new Escalador("B", 2);
        Contrarelojista v3 = new Contrarelojista("c", 3);
        Equipo e = new Equipo("AA", 2);

        //System.out.println(v1.imprimirTipo());

        e.agregarCiclista(v1);
        e.agregarCiclista(v2);
        e.agregarCiclista(v3);

        v1.setTiempo(10);
        v2.setTiempo(20);

        e.printDatos();

        e.buscarID(2);

        System.out.println("_______________________________");
        System.out.println(e.tiempoTotal());

        e.nombres();
        ;

        //v1.imprimirDatos();
    }
}
