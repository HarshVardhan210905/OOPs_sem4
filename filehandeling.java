import java.io.File;
import java.io.IOException;
public class filehandeling {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\Harshvardan Singh\\Desktop\\opps sem4\\test files");
        System.out.println(f.createNewFile());
        
    }
}
