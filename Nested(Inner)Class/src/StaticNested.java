class Outer1Class {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}
public class StaticNested {
    public static void main(String[] args) {
        Outer1Class.InnerClass myInner = new Outer1Class.InnerClass();
        System.out.println(myInner.y);
    }
}
