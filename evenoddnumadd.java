import java.util.Scanner;
public class evenoddnumadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sum of array
        int [] j = {1,3,2,5,9,9,8,10};
        int sum = 0;
        for (int i = 0; i < j.length; i++) {
            sum= sum+j[i];
        }
        System.out.println("sum of array is "+sum);

        //sum of even and oddnums
        int even=0;
        int odd=0;
        for (int i = 0; i < j.length; i++) {
            if(j[i]%2==0){
                even=even+j[i];
            }
            else{
                odd=odd+j[i];
            }
        
        }
        System.out.println("sum of even is "+even);
        System.out.println("sum of odd is " +odd);
        // maximum and minimum number in an array

     int [] z = {1,3,2,5,9,9,8,10};
     int max = z[0];
        int min = z[0];
        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 1; i < z.length; i++) {
            if (z[i] > max) {
                max = z[i];
                maxIndex = i;
            }
            if (z[i] < min) {
                min = z[i];
                minIndex = i;
            }
        }
        
        System.out.println("Maximum value: " + max + " at index: " + maxIndex);
        System.out.println("Minimum value: " + min + " at index: " + minIndex);

        ///sum ofarray
        /// sum of even oddd
        /// max min in array with index
        /// 


    }
}
