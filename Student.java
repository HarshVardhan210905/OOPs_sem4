public class Student {
    static String universityName = "UPES";
    String studentName;
    Student(String name) {
        studentName = name;
    }
    static void displayUniversity() {
        System.out.println("University: " + universityName);
    }
    void displayStudent() {
        System.out.println("Student Name: " + studentName + ", University: " + universityName);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Harsh");
        Student s2 = new Student("Het Mehta");
        Student s3 = new Student("Jahanvi");
        Student.displayUniversity();
        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
        Student.universityName = "Graphic Era";
        System.out.println("After change:\n");
        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
    }
}