import java.util.Scanner;
public class array1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[][]j=new int[2][3];
        System.out.println("enter an array");
        for(int i=0;i<3;i++){
            for(int b=0;b<2;b++){
                b[i][j]=sc.nextInt();
        }
       }
       for (int i=0;i<3;i++){
        System.out.println();
       for (int k=0;k<3;k++){
        System.out.print(j[k][k] + "");
       }

    }
}
}