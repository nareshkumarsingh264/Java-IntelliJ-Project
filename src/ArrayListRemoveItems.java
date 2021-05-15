import java.util.ArrayList;
public class ArrayListRemoveItems {
    public static void main (String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Bolero");
        cars.add("Swift");
        cars.add("Artiga");
        cars.add("Renolt");
        cars.remove(0);
        System.out.println(cars);
    }
}
