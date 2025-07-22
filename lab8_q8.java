import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class lab8_q8 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("student.txt");
            int character;
            System.out.println("Student file content:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: student.txt file not found.");
        } 
        catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
