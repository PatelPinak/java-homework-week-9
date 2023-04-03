package p02_p11_week9;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class P07_EmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        if (list.isEmpty()) {       //Create an empty array list
            System.out.println("The ArrayList is empty");
        }else {
            System.out.println("The ArrayList is not empty");
        }

        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Indigo");
        list.add("Violet");
        System.out.println(list);

        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty");
        }else {
            System.out.println("The ArrayList is not empty");
        }
    }
}
