 class Student {
    String name;

    Student(String name) {
        this.name = name; // `this.name` refers to the instance variable
    }

    void display() {
        System.out.println("Student name: " + name);
    }
 }
public class test{
    public static void main(String[] args) {
        Student s = new Student("John");
        s.display();
        Student s1 = new Student("harsh");
        s1.display();
    }
}
