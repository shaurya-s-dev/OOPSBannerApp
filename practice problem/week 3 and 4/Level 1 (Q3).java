import java.util.Scanner;

class LargestChecker {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get 3 numbers from user
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
        System.out.print("Enter number3: ");
        int number3 = input.nextInt();

        // Check which number is largest
        boolean isFirstLargest  = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest  = (number3 > number1) && (number3 > number2);

        // Display results
        System.out.println("Is the first number the largest?  " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest?  " + isThirdLargest);
        input.close();
    }
}