package pckg_zd3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        fillSet(hashSet);
        fillSet(linkedHashSet);
        fillSet(treeSet);
        System.out.println("HashSet: ");
        printSet(hashSet);
        System.out.println("TreeSet: ");
        printSet(treeSet);
        System.out.println("LinkedHashSet: ");
        printSet(linkedHashSet);

        System.out.println("Test HashSet: ");
        checkSet(hashSet, "Nema ga");
        System.out.println("Ispis: ");
        printSet(hashSet);




    }

    public static void fillSet(Set<String> set){
        set.add("New York");
        set.add("Biograd");
        set.add("Benkovac");
        set.add("Unešić");
        set.add("Skradin");

    }
    public static void checkSet(Set<String> set, String el){
        if (set.contains(el)){
            System.out.println("Element postoji!");
        }else {
            System.out.println(el + " nije u skupu i dodaje se!");
            set.add(el);
        }
    }
    public static void printSet(Set <String> set){
        for (String el : set){
            System.out.println(el);
        }
    }
    public static void delEl(Set<String> set, String el){
        if (set.contains(el)){
            set.remove(el);
            System.out.println("Element " + el + " obrisan!");
        }else {
            System.out.println("Element " + el + " ne postoji!");
        }
    }
}
