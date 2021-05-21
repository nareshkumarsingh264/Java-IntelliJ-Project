public class MethodParameterMultiple {
    static void myMethod(String fname,int age){
        System.out.println(fname + " is " + age);
    }
    public static void main(String[] args) {
        myMethod("Naresh",30);
        myMethod("Ramesh",32);
        myMethod("Suresh",33);
        myMethod("Mahesh",34);
    }
}
