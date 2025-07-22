class s1 {
    private int privateVar = 100; 

    public int getPrivateVar() { 
        return privateVar;
    }
}

class s2 extends s1 {
    void display() {
        System.out.println("private variable is accessed : "+getPrivateVar());
}
}

public class lab5_q1 {
    public static void main(String[] args) {
        s2 obj = new s2();
        obj.display();
    }
}