import java.util.Scanner; // be sure to import library that allows the use of Scanner!

public class SentinelLoopSolution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;

        // pull one prompt/read ("post") out of the loop
        System.out.print("Type a word (or \"quit\" to exit): ");
        String response = console.next();

        while (!response.equals("quit")) {
            sum += response.length();    // moved to top of loop
            System.out.print("Type a word (or \"quit\" to exit): ");
            response = console.next();
        }

        System.out.println("You typed a total of " + sum + " characters.");
    }

}