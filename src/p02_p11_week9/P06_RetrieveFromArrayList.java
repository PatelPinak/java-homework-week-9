package p02_p11_week9;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class P06_RetrieveFromArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Indigo");
        list.add("Violet");
        System.out.println(list);
        String element = list.get(0);
        System.out.println("First element: " + element);
        element = list.get(3);
        System.out.println("Fourth element: " + element);
    }
}
