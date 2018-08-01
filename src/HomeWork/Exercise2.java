package HomeWork;
import java.util.ArrayList;
import java.util.*;

public class Exercise2 {

    public static void main(String[] args) {
        ArrayList List = new ArrayList();
        Random generator = new Random();

        for (double i = 0; i < 36; i++) {
            List.add(generator.nextDouble());
        }

        System.out.println(List);
        double sum = 0;
        for (double i=0; i< List.size(); i++) {
            sum += i;
        }
        Double Aver = sum / List.size();

        System.out.println("Srednia wszytskich liczb ArrayList wynosi: " +Aver);
    }

}