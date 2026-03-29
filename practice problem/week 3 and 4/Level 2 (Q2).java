import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get salary and years of service from user
        System.out.print("Enter salary (INR): ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        // Bonus percentage and threshold
        double bonusPercent  = 5.0;
        int    serviceThreshold = 5;

        // Calculate bonus if years of service > 5
        if (yearsOfService > serviceThreshold) {
            double bonusAmount = salary * bonusPercent / 100;
            System.out.println("The bonus amount is INR " + bonusAmount);
        } else {
            System.out.println("No bonus. Years of service must be more than "
                               + serviceThreshold);
        }
        input.close();
    }
}