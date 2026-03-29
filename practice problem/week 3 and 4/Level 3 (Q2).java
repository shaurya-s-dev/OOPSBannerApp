import java.util.Scanner;

class MarksGrade {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get marks for 3 subjects
        System.out.print("Enter Physics marks:   ");
        double physicsMarks = input.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistryMarks = input.nextDouble();
        System.out.print("Enter Maths marks:     ");
        double mathsMarks = input.nextDouble();

        // Total marks per subject
        double totalPerSubject = 100;

        // Calculate average percentage
        double averagePercent = (physicsMarks + chemistryMarks + mathsMarks) 
                                 / (3 * totalPerSubject) * 100;

        // Determine grade and remarks
        String grade;
        String remarks;

        if (averagePercent >= 90) {
            grade   = "A+";
            remarks = "Outstanding";
        } else if (averagePercent >= 75) {
            grade   = "A";
            remarks = "Excellent";
        } else if (averagePercent >= 60) {
            grade   = "B";
            remarks = "Good";
        } else if (averagePercent >= 50) {
            grade   = "C";
            remarks = "Average";
        } else if (averagePercent >= 40) {
            grade   = "D";
            remarks = "Below Average";
        } else {
            grade   = "F";
            remarks = "Fail";
        }

        // Display result
        System.out.println("Average Marks: " + averagePercent + "%");
        System.out.println("Grade: "   + grade);
        System.out.println("Remarks: " + remarks);
        input.close();
    }
}