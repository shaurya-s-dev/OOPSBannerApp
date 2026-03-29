import java.util.Scanner;

class NaturalNumberSum {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is a natural number
        if (number > 0) {
            // Compute sum using formula
            int sumOfNaturalNumbers = number * (number + 1) / 2;
            System.out.println("The sum of " + number + 
                               " natural numbers is " + sumOfNaturalNumbers);
        } else {
            System.out.println("The number " + number + 
                               " is not a natural number");
        }
        input.close();
    }
}