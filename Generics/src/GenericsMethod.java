public class GenericsMethod {
    public <E> void printArray(E []s){
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        GenericsMethod gm = new GenericsMethod();
        String[] countries = {"India","USA","Nepal","Bhutan"};
        gm.printArray(countries);
        Integer[] numbers = {2,4,6,8,10};
        gm.printArray(numbers);
    }
}
