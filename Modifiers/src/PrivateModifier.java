public class PrivateModifier {

        private String fname = "Jatin";
        private String lname = "Doe";
        private String email = "jatin@doe.com";
        private int age = 26;

        public static void main(String[] args) {
            PrivateModifier myObj = new  PrivateModifier();
            System.out.println("Name: " + myObj.fname + " " + myObj.lname);
            System.out.println("Email: " + myObj.email);
            System.out.println("Age: " + myObj.age);
        }
}
