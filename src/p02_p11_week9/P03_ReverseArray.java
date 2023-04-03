package p02_p11_week9;

import java.util.Arrays;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class P03_ReverseArray {
    public static void main(String[] args) {
        int a[] = new int[4];
        a[0] = 55;
        a[1] = 67;
        a[2] = 35;
        a[3] = 20;
        System.out.println("Original order is:" + Arrays.toString(a));
        P03_ReverseArray obj = new P03_ReverseArray();          // printing the reversed array
        obj.reverse(a);
    }
    public void reverse(int a[]) {
        //System.out.println("Original order is:" + Arrays.toString(a));
        System.out.println("Reverse array is: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
