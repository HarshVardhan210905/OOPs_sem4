import java.util.Scanner;
public class lab8_q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        try {
            System.out.print("Enter an index from 0 to 4 to access the array element: ");
            int index = scanner.nextInt();
            if (index < 0 || index >= numbers.length) {
                System.out.println("Error: Index " + index + " is out of bounds.");
            } 
            else {
                System.out.println("Element at index " + index + ": " + numbers[index]);
            }
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Array access attempted.");
            scanner.close();
        }
    }
}