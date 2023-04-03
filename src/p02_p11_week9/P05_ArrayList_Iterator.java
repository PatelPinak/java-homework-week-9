package p02_p11_week9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class P05_ArrayList_Iterator {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Indigo");
        list.add("Violet");
        System.out.println(list);

        Iterator<String> a = list.iterator();   //Create an iterator for the list using iterator method
        while (a.hasNext()){
            System.out.println(a.next());
        }
    }
}
