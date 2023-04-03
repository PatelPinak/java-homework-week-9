package p02_p11_week9;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class P04_ArrayList {
    ArrayList<String> list = new ArrayList<>();
    public void addColours(){      //Declaring the ArrayList
        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Indigo");
        list.add("Violet");
        for (String s : list) {
            System.out.println(s);  // Printing the ArrayList
        }
    }

    public static void main(String[] args) {
        P04_ArrayList obj = new P04_ArrayList();
        obj.addColours();
    }
}
