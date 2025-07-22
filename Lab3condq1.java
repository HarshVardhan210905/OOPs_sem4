import java.util.Scanner;
public class Lab3condq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter grade of OOPS : ");
        int oops = sc.nextInt();
        System.out.println("enter grade of ITCS : ");
        int itcs = sc.nextInt();
        System.out.println("enter grade of Software : ");
        int software = sc.nextInt();
        int avg =(oops+itcs+software)/3;
        System.out.println("your avereage is :" + avg);
        if(avg>=90){
            System.out.println("Grade A");
        }
        else if(avg>=75){
            System.out.println("Grade B");
        }
        else if(avg>=50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade F");
        }
    }
}
