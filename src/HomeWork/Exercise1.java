package HomeWork;

import java.util.*;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] tab = new int[N];

        Random r = new Random();
        for(int i=0;i<N;i++) {
            tab[i] = r.nextInt();
            System.out.println(tab[i]);
        }

    }

}
