class UnderAgeException1 extends RuntimeException{
    UnderAgeException1(){
        super(" you are under age");
    }
    UnderAgeException1(String message){
        super(message);
    }
}
public class UnCheckedExceptionVoting {
    public static void main(String[] args) {
        int age = 16;
        try {
            if(age < 18) {
                throw new UnderAgeException("you cannot vote your age below 18");
            }
            else {
                System.out.println(" you can vote now");
            }
        }
        catch (UnderAgeException e){
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}


