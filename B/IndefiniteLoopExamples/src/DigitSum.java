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
		
		// do stuff here to figure out the sum of the digits

        return sum;
    }

    public static int digitMin(int num) {
		int min = -1;

        // do stuff here to figure out the min of the digits

        return min;
    }
}