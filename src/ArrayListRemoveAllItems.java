import java.util.ArrayList;
public class ArrayListRemoveAllItems {
    public static void main(String[] args) {
        ArrayList<Integer> mynumbers = new ArrayList<Integer>();
        mynumbers.add(2);
        mynumbers.add(6);
        mynumbers.add(13);
        mynumbers.add(23);
        mynumbers.add(25);
        mynumbers.clear();
        System.out.println(mynumbers);
    }
}
