public class DigitSumSolution {

    public static void main(String[] args) {
        int number = 29107;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number));     // should return 19 (2+9+1+0+7)
        System.out.println("Min: " + digitMin(number));     // should return 0
        number = -456;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number));     // should return 15 (4+5+6)
        System.out.println("Min: " + digitMin(number));     // should return 4

        System.out.println(digitMin2(29107));
        System.out.println(digitMin2(-456));

        System.out.println(digitMin3(29107));
        System.out.println(digitMin3(-456));
    }

    public static int digitSum(int num) {
        if (num == 0) return 0; // handle trivial solution
        if (num < 0) num *= -1; //make it a positive integer
        int sum = 0;    // initialize sum at zero (the default prior to summing any digits)
        while (num > 0) {
            int d = num % 10; //extract the last digit
            sum += d; //process the last digit
            num /= 10; // truncate (or "chop off") the last digit (because it is already processed)
        }
        return sum; // return the sum to calling program
    }

    // uses a while loop - initializes using the highest possible digit (9)
    public static int digitMin(int num) {
        if (num == 0) return 0; // handle trivial solution
        if (num < 0) num *= -1; //make it a positive integer
        int min = 9; //initialize with the highest possible digit (default or worst case when looking for a minimum)
        while (num > 0) {
            int d = num % 10; //extract the last digit
            if (d < min) {  // test to see if last digit is less than the current minimum
                min = d; // last digit is less than current - update current minimum to be the last digit
            }
            num /= 10; // truncate (or "chop off") the last digit (because it is already processed)
        }
        return min; // return the minimum to calling program
    }

    // uses a do-while loop to return the minimum digit (check is at the end); same logic in loop as while loop
    public static int digitMin2(int num) {
        if (num == 0) return 0; // handle trivial solution
        if (num < 0) num *= -1; //make it a positive integer
        int min = 9; //initialize with the highest possible digit (default or worst case when looking for a minimum)
        do {
            int d = num % 10; //extract the last digit
            if (d < min) {  // test to see if last digit is less than the current minimum
                min = d; // last digit is less than current - update current minimum to be the last digit
            }
            num /= 10; // truncate (or "chop off") the last digit (because it is already processed)
        } while (num > 0);
        return min; // return the minimum to calling program
    }

    // uses a while loop to return the minimum digit; initializes min by extracting the last digit and then eliminates it
    public static int digitMin3(int num) {
        if (num < 0) {
            num *= -1; //make it a positive integer
        }
        int min = num % 10; //initialize using the rightmost digit
        num /= 10;  // truncate (or "chop off") the last digit (because it is already processed)
        while (num > 0) {
            int d = num % 10; //extract the last digit
            if (d < min) {  // test to see if last digit is less than the current minimum
                min = d; // last digit is less than current - update current minimum to be the last digit
            }
            num /= 10; // truncate (or "chop off") the last digit (because it is already processed)
        }
        return min; // return the minimum to calling program
    }
}