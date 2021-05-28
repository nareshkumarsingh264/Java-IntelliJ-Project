
class DivideZeroException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    DivideZeroException(String msg) {
        super(msg);
    }
}

class ArithmeticException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    ArithmeticException() {
        super("Divide by zero");
    }

    ArithmeticException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        CustomExceptionDemo demo = new CustomExceptionDemo();
        try {
            demo.exampleOne();
        } catch (DivideZeroException e) {
            System.out.println("error: " + e.getMessage());
        }

        try {
            demo.exampleTwo();
        } catch (DivideZeroException e) {
            System.out.println("error: " + e.getMessage());
        }

        try {
            demo.exampleThree();
        } catch (ArithmeticException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * we already told to handle divider's value if zero
     *
     * @throws DivideZeroException
     */
    private void exampleOne() throws DivideZeroException {
        int dividant = 12;
        int divider = 0;
        if (divider == 0)
            throw new DivideZeroException("not valid value, we can't proceed");
        else
            System.out.println("Result: " + dividant / divider);
    }

    /**
     * custom exception with try-catch and throw to our custom exception from
     * catch in this case, we don't know what exception will occur
     *
     * @throws DivideZeroException
     */
    private void exampleTwo() throws DivideZeroException {
        int dividant = 12;
        int divider = 0;
        try {
            System.out.println("Result: " + dividant / divider);
        } catch (Exception e) {
            throw new DivideZeroException("not valid operation");
        }
    }

    private void exampleThree() throws ArithmeticException {
        int dividant = 12;
        int divider = 0;
        if(divider == 0)
            throw new ArithmeticException();
        else
            System.out.println("Result: " + dividant / divider);
    }
}
