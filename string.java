
import java.lang.reflect.Array;

public class string {
    public static void main(String[] args) {
       /* String s1 = "hello";
        System.out.println(s1);
        String s2 = new String ("hello");
        System.out.println(s2);
        String s3 = "hello";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.startsWith(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.length());
        System.out.println(s1.trim());
        System.out.println(s1.trim().length());
        */
       
       /* String s1 = "hello";
        char[] a=s1.toCharArray();
        System.out.println(a[1]);
        String s2="world";
        s2=s1.substring(2,9);
        System.out.println(s2);
         */
        
        String s1="hello ^ world";
        s1.split(" ");
        char[] s=Arrays.toString(s1.split(" "));

    }
}
