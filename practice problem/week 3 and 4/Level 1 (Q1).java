import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Display result
        System.out.println("Is the number " + number + 
                           " divisible by 5? " + isDivisible);
        input.close();
    }
}