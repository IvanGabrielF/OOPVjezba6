package pckg_zd1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("pet");
        arrayList.add("proizvoljnih");
        arrayList.add("elemenata");
        arrayList.add("u");
        arrayList.add("listu");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(arrayList);

        System.out.println("Array list: " + arrayList);
        System.out.println("Linked list: " + linkedList);

        linkedList.add(0,"početak");
        linkedList.add(linkedList.size(), "kraj");


        for (int i=0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }
        System.out.println("List after change: ");
        changeElement(3,linkedList,"noviNovi");
    }
    public static void changeElement(int idx, LinkedList<String> list, String newEl){
        try {
            String priv = list.get(idx);
            list.set(idx,newEl);
            System.out.println(list);
            System.out.println("Elememnt replaced: " + priv);
        }catch (IndexOutOfBoundsException ioe){
            System.out.println("Entered index out of bounds!");
        }

    }
}
