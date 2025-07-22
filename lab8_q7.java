import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class lab8_q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = input.nextLine();
        System.out.print("Enter roll number: ");
        String roll = input.nextLine();
        System.out.print("Enter grade: ");
        String grade = input.nextLine();
        try {
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("Name: " + name + ", Roll Number: " + roll + ", Grade: " + grade + "\n");
            writer.close();
            System.out.println("Student information saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
        input.close();
    }
}
