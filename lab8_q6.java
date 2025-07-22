import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class lab8_q6 {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        System.out.println("File contents:");
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
    }
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = inputScanner.nextLine();
        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } finally {
            System.out.println("File operation attempted.");
        }
        inputScanner.close();
    }
}

