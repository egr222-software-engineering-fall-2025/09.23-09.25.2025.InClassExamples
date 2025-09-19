import java.util.Scanner;

public class RobustScanner_v1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How old are you? ");
        if (console.hasNextInt()) {
            int age = console.nextInt();   // will not crash!
            System.out.println("Wow, " + age + " is old!");
        } else {
            System.out.println("You didn't type an integer.");
        }
    }
}
