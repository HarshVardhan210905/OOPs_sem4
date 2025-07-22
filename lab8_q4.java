import java.util.Scanner;
public class lab8_q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();
            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();
            if (divisor == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                int result = dividend / divisor;
                System.out.println("Result: " + result);
            }
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Operation completed.");
            scanner.close();
        }
    }
}
