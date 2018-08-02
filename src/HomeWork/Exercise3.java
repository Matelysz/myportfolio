package HomeWork;
import java.util.*;
import java.util.ArrayList;


public class Exercise3 {

    public static void main (String[]args) {

        ArrayList<Double> lista = new ArrayList<>();
        Double[] tablica = new Double[2];

        Random gen = new Random();

        for(double i=0; i<100; i++) {
            lista.add(gen.nextDouble()*10);
        }
        System.out.println(lista);
        System.out.println(lista.size());

        Collections.sort(lista);
        System.out.println(lista);
        tablica[0] = lista.get(0);
        tablica[1] = lista.get(99);

        System.out.println("Najmniejszym elementem kolekcji jest: " + tablica[0]);
        System.out.println("Najwiekszym elementem kolekcji jest: " + tablica[1]);



    }


}
