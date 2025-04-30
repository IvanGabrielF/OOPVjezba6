package pckg_zd5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();

        lst.add("auto");
        lst.add("svemirski brod");
        lst.add("avion");
        lst.add("helikopter");
        lst.add("jedrilica");
        lst.add("gliser");
        lst.add("romobil");
        lst.add("bicikla");

        System.out.println("Bez sortiranja:");
        for (String st : lst){
            System.out.println(st);
        }
        Collections.sort(lst);

        System.out.println("Sortirano abecedno: ");
        for (String st : lst){
            System.out.println(lst);
        }

        Collections.sort(lst, new LengthStrComparator());

        System.out.println("Sortirano po duljini stringa: ");
        for (String st : lst){
            System.out.println(lst);
        }

    }

}
