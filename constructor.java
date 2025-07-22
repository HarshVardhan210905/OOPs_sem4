class Student {
    String name;
    int rollno;
    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
}
class Test{
    Test(double d){
        this(10);
        System.out.println("double arg");
    }
    Test(int i){
        this();
        System.out.println("int arg");
    }
    Test(){
        System.out.println("no arg");
    }
}
public class constructor {
        public static void main(String[] args) {
            Student s1 = new Student("xyz",101);
            Student s2 = new Student("PQR",102);
            Test t1 = new Test(10.5);
    }
    
}
