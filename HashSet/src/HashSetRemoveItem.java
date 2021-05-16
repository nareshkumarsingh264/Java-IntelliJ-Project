import java.util.HashSet;
public class HashSetRemoveItem {
    public static void main(String[] args) {
        HashSet<String> bikes = new HashSet<String>();
        bikes.add("Hero");
        bikes.add("Bajaj");
        bikes.add("Mahindra");
        bikes.add("Honda");
        bikes.remove("Honda");
        System.out.println(bikes);
    }
}
