public class MethodCallMultipleTime {
    static void myMethod(){
        System.out.println("I Just Got Executed");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        myMethod();
    }
}
