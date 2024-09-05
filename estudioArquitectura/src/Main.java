import Objetos.*;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("AAAA");

        Proyecto proyecto1 = new Proyecto();
        Proyecto p2 = new Proyecto();

        Figura f1 = new Figura();
        Poligono f2 = new Poligono();
        proyecto1.setCodigo("AAA");

        JefeDeProyecto j2 = new JefeDeProyecto("","","");
        JefeDeProyecto j1 = new JefeDeProyecto("","","");

        j1.setNombre("Juan");
        j2.setNombre("Juan");
        proyecto1.setJefe(j1);
        p2.setJefe(j1);


        Lineas linea = new Lineas("10", 15, 13);
        System.out.println(linea.getLongitud());


    }
}
