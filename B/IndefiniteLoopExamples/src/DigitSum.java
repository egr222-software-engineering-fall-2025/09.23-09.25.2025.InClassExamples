public class DigitSum {
    public static void main(String[] args) {
        int number = 29107;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number)); // should return 19 (2+9+1+0+7)
        System.out.println("Min: " + digitMin(number)); // should return 0
        number = -456;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number)); // should return 15 (4+5+6)
        System.out.println("Min: " + digitMin(number)); // should return 4
    }

    public static int digitSum(int num) {
		if (num ==0) return 0; // handle trivial solution
        if (num < 0) num *= -1; //make it a positive integer

        int sum = 0;

        while (num != 0) {
            int d = num % 10; //extract the last digit
            sum += d;   // process the lastdigit
            num /= 10; // truncate (or "chop off") the last digit (because it is already processed)
        }

        return sum;
    }

    public static int digitMin(int num) {
		int min = -1;

        // do stuff here to figure out the min of the digits

        return min;
    }
}