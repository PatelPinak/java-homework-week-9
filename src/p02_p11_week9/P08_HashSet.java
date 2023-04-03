package p02_p11_week9;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class P08_HashSet {

    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();    //Instantiate an object of HashSet
        list.add(4);
        list.add(25);
        list.add(7);
        list.add(41);
        list.add(8);
        //list.add(10);
        for (int a : list) {
            if (a>0 && a<11)
            System.out.println(a);
        }
    }
}
