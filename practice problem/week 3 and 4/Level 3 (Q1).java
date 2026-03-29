import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get year from user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check for valid Gregorian calendar year
        int gregorianStartYear = 1582;
        if (year < gregorianStartYear) {
            System.out.println("Year must be >= " + gregorianStartYear);
        } else {
            // Check leap year: divisible by 4 and not 100, unless divisible by 400
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) 
                                  || (year % 400 == 0);

            if (isLeapYear) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
        input.close();
    }
}