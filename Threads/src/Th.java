//Concurrency Problems
public class Th  extends Thread{
    public static int amount = 0;
    public static void main(String[] args) {
        Th thread = new Th();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Th: " + amount);
        amount++;
        System.out.println("Th: " + amount);
    }
    public void run() {
        amount++;
    }
}

