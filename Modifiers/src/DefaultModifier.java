class DefaultModifier {
    String fname = "Rajesh";
    String lname = "Sharma";
    String email = "Rajesh@Sharma.com";
    int age = 28;

    public static void main(String[] args) {
        DefaultModifier myObj = new DefaultModifier();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}
