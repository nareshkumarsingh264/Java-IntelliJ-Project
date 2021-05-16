import java.util.LinkedList;
public class LinkedListAddLastItem {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.addLast("Banana");
        System.out.println(fruits);
    }
}
