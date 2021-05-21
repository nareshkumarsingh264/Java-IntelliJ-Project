public class MethodReturnValue2 {
    static  int myMethod(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(8,7);
        System.out.println(z);
    }
}
