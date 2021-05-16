import java.util.HashMap;
public class HashMapAddItemsStringInteger {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("Ram", 32);
        people.put("Suresh", 30);
        people.put("Mahesh", 33);
        people.put("Rajesh", 31);


        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
