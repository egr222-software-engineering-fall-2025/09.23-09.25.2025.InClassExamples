import java.util.Scanner;

public class RobustScanner_v2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How old are you? ");
        boolean ageEntered = console.hasNextInt();  // check the next token to see if it is an int
        while (!ageEntered) {
//            console.next();   // discard the non-integer token...or...
            // get the non-integer token so we can provide an “intelligent” error message
            String invalidAge = console.next();   // get the non-integer token so we can have
            System.out.println(invalidAge + " is not a valid age.");
            System.out.print("How old are you? ");
            ageEntered = console.hasNextInt();  // check the next token to see if it is an int
        }
        // if we get here, we know the user typed an integer
        int age = console.nextInt();
        System.out.println("Wow, " + age + " is old!");
    }
}