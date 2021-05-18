public class Encapsulation1 {
    public static void main(String[] args) {
        Person1 myObj = new Person1();
        myObj.setName("Naresh");
        myObj.setAge(31);
        myObj.setIdNum("12343ms");
        System.out.println("Name: "  +  myObj.getName() +  " Age: "  + myObj.getAge() +  " IdNum: "  + myObj.getIdNum());
    }
}