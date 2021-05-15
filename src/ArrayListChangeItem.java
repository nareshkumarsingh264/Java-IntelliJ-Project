import java.util.ArrayList;
public class ArrayListChangeItem {
    public static void main(String[] args){
        ArrayList<Integer> mynumbers= new ArrayList<Integer>();
        mynumbers.add(2);
        mynumbers.add(4);
        mynumbers.add(6);
        mynumbers.add(8);
        mynumbers.add(10);
        mynumbers.set(0,12);
        System.out.println(mynumbers);
    }
}
