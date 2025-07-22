import java.util.Scanner;
public class Lab3contq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2= new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr2[i]=arr[i];
        }
        System.out.println("Elements of array 2 is :- ");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);

        }
    }
}