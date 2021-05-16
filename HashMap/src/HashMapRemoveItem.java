import java.util.HashMap;
public class HashMapRemoveItem {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String,String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.remove("Germany");
        System.out.println(capitalCities);
    }
}

