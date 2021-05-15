import java.util.ArrayList;
public class ArraylistForeahLoop {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Fig");
        fruits.add("Mango");
        for (String i :  fruits) {
            System.out.println(i);
        }
    }
}
