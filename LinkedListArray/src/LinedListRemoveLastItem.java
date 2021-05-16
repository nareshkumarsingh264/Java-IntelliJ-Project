import java.util.LinkedList;
public class LinedListRemoveLastItem {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.removeLast();
        System.out.println(numbers);
    }
}
