class Outer2Class {
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}
public class Nested2 {
    public static void main(String[] args) {
        Outer2Class myOuter = new Outer2Class();
        Outer2Class.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}
