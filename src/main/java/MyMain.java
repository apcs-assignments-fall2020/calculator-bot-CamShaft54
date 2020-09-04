import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        return IntStream.of(a, b, c).sorted().toArray()[1];
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Calculator Bot!\nWhich program would you like to run?\n(median, magnitude, pythagoras)");
        String menu = scan.next();
        int[] nums = new int[3];
        if (menu.equalsIgnoreCase("median") || menu.equalsIgnoreCase("magnitude") || menu.equalsIgnoreCase("pythagoras")) {
            System.out.println("Enter int a:");
            nums[0] = scan.nextInt();
            System.out.println("Enter int b:");
            nums[1] = scan.nextInt();
        }
        switch(scan.next()) {
            case "median":
                System.out.println("Enter int c:");
                nums[2] = scan.nextInt();
                System.out.println("The median of " + Arrays.toString(nums) + " is " + median(nums[0], nums[1], nums[2]));
                break;
            case "magnitude":
                System.out.println("The number with the highest magnitude of " + Arrays.toString(nums) + " is " + magnitude(nums[0], nums[1]));
                break;
            case "pythagoras":
                System.out.println("Enter int c:");
                nums[2] = scan.nextInt();
                System.out.println("The length of the hypotenuse given the values" + Arrays.toString(nums) + " is " + pythagoras(nums[0], nums[1]));
                break;
            default:
                System.out.println("Invalid Argument");
        }
        scan.close();
    }
}
