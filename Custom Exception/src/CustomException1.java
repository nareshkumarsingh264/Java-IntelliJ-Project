
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomException1 {
    public void analyze(List<String> data) {

        if (data.size() > 50) {
            //runtime exception
            throw new ListTooLargeException("List can't exceed 50 items!");
        }

        //...
    }

    public static void main(String[] args) {

        CustomException1 obj = new  CustomException1();

        //create 100 size
        List<String> data = new ArrayList<>(Collections.nCopies(100, "mkyong"));

        obj.analyze(data);


    }
}
class ListTooLargeException extends RuntimeException{

    ListTooLargeException(String message) {
        super(message);
    }
}
