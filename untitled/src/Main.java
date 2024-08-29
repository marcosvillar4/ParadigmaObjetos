import Objetos.*;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("AAAA");

        Control func = new Control();
        Proyecto proyecto1 = new Proyecto();

        Figura f1 = new Figura();
        Poligono f2 = new Poligono();

        proyecto1.setCodigo("AAA");
        proyecto1.setJefe(func.CrearJefe("AAAA", "Juan", "1234", "11111111"));
        //func.CrearJefe("BBB", "Juan","","");




    }
}
