public class protectedModifier {
    protected String fname = "Naresh";
    protected String lname = "Gurjar";
    protected String email = "Naresh@Gurjar.com";
    protected int age = 30;
}

class Student extends  protectedModifier {
    private int graduationYear = 2018;
    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}
