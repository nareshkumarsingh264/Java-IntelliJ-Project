
 class AbstractModifier {
     public static void main(String[] args) {
         // create an object of the Student class (which inherits attributes and methods from Main)
         Student1 myObj = new Student1();

         System.out.println("Name: " + myObj.fname);
         System.out.println("Age: " + myObj.age);
         System.out.println("Graduation Year: " + myObj.graduationYear);
         myObj.study(); // call abstract method
     }
}
