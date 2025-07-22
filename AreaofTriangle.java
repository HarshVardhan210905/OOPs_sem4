import java.util.Scanner;
class AoT{
    public double calculateArea(double b,double h){
        return (b * h) / 2;
    }
}
public class AreaofTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AoT aot = new AoT();
        System.out.println("Enter the base of the triangle");
        double b = sc.nextDouble();
        System.out.println("Enter the height of the triangle");
        double h = sc.nextDouble();
        System.out.println("The area of the triangle is " + aot.calculateArea(b,h));
    }
}

