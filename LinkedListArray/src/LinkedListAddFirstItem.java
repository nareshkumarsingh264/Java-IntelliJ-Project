import java.util.LinkedList;
public class LinkedListAddFirstItem {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.addFirst("Banana");
        System.out.println(fruits);
    }
}
