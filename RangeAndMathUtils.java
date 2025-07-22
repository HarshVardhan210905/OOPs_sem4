import java.util.Random;
import java.util.Scanner;
class Range{
    
}
public class RangeAndMathUtils{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        RangeOperations rangeOpe = new RangeOperations();
        MathUtils mathutils = new MathUtils();
        int choice;
        do{
            System.out.println("Enter your choice");
            System.out.println("1.Perform range operations");
            System.out.println("2. Perform math utils");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            choice=scanner.nextInt():
            switch(choice){
                case 1:
                rangeOpe.porRo(scanner);
                case 2:
                mathutils.pMo(scanner);
                case 3:
                System.out.println("exit");
                default:
                System.out.println("enter your choice");
            }
        }while(choice !=3);
    }
    Scan close();

}