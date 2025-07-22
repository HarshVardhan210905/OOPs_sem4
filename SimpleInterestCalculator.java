import java.util.Scanner;
class Si{
    public double CalculateInterest(double p,double r,double t){
        return p*r*t/100;

    }
}
public class SimpleInterestCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double r = sc.nextDouble();
        System.out.println("Enter the time period");
        double t = sc.nextDouble();
        Si si = new Si();
        double interest = si.CalculateInterest(p, r, t);
        System.out.println("The Simple Interest is " + interest);

    }
}