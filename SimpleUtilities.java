import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
public class SimpleUtilities{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Any num1 : " );
        int num1 = Sc.nextInt();
        System.out.println("Any num2 : ");
        int num2 = Sc.nextInt();
        int max = Math.max(num1, num2);
        System.out.println("Maximum between " + num1 + " and " + num2 + " is " + max);
        // Math math= new Math();
        // Random random = new Random();
        // Scanner scan=new Scanner(System.in);
        // int IN1 =random.nextInt(100);
        // int IN2 =random.nextInt(100);
        // System.out.println(IN1);
        // System.out.println(IN2);
        // double SQR1=math.Sqrt(IN1);
        // double SQR2=math.Sqrt(IN2);



    }


}