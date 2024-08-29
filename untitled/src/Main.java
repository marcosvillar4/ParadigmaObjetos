import Objetos.*;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("AAAA");

        Control func = new Control();
        Proyecto proyecto1 = new Proyecto();
        Proyecto p2 = new Proyecto();

        Figura f1 = new Figura();
        Poligono f2 = new Poligono();
        JefeDeProyecto j1 = func.CrearJefe("AAAA", "Juan", "1234", "11111111");
        proyecto1.setCodigo("AAA");



        //func.CrearJefe("BBB", "Juan","","");

        Lineas linea = new Lineas("10", 15, 13);
        System.out.println(linea.getLongitud());


    }
}
