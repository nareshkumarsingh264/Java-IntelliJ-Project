import java.util.HashSet;
public class HashSetSize {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        System.out.println(numbers.size());
    }
}
