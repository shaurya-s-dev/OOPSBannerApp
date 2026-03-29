import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (cm): ");
        double base = input.nextDouble();

        System.out.print("Enter height (cm): ");
        double height = input.nextDouble();

        double cmToInchFactor = 2.54;
        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / (cmToInchFactor * cmToInchFactor);

        System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                           " and sq cm is " + areaSqCm);
    }
}