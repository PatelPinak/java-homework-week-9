package p02_p11_week9;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and
 * Integer values: And use for each loop to iterate the value from Map.
 */
public class P09_HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> people = new HashMap<>();   //Create hash map by declaring object of Integer and String
        people.put(4, "Alice");
        people.put(2, "Bryan");
        people.put(1, "Charlie");
        people.put(3, "Daniel");
        for (Map.Entry<Integer,String > map : people.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}