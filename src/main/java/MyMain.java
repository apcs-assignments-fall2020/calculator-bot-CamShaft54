import java.util.Arrays;
import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int[] nums = new int[] {a, b, c};
        Arrays.sort(nums);
        return nums[1];
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int mag = Math.max(Math.abs(a), Math.abs(b));
        if (mag == Math.abs(a)) {
            return a;
        }
        return b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Calculator Bot!\nWhich program would you like to run?\n(median, magnitude, pythagoras)");
        switch(scan.next()) {
            case "median":
                int[] med_nums = new int[3];
                for (int i = 0; i < 3; i++) {
                    System.out.println("Median: Enter int " + (i+1));
                    med_nums[i] = scan.nextInt();
                }
                System.out.println("The median of " + Arrays.toString(med_nums) + " is " + median(med_nums[0], med_nums[1], med_nums[2]));
                break;
            case "magnitude":
                int[] mag_nums = new int[2];
                for (int i = 0; i < 2; i++) {
                    System.out.println("Magnitude: Enter int " + (i+1));
                    mag_nums[i] = scan.nextInt();
                }
                System.out.println("The number with the highest magnitude of " + Arrays.toString(mag_nums) + " is " + magnitude(mag_nums[0], mag_nums[1]));
                break;
            case "pythagoras":
                int[] pyt_nums = new int[2];
                for (int i = 0; i < 2; i++) {
                    System.out.println("Pythagoras: Enter int " + (i+1));
                    pyt_nums[i] = scan.nextInt();
                }
                System.out.println("The length of the hypotenuse given the values" + Arrays.toString(pyt_nums) + " is " + pythagoras(pyt_nums[0], pyt_nums[1]));
                break;
            default:
                System.out.println("Invalid Argument");
        }
        scan.close();
    }
}
