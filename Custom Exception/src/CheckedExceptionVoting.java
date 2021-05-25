class UnderAgeException extends Exception{
    UnderAgeException(){
        super(" you are under age");
    }
    UnderAgeException(String message){
        super(message);
    }
}
public class CheckedExceptionVoting {
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
}
}
