abstract class Shape {
    abstract void getArea();
}

class Box extends Shape {
    double length, width;
    Box(double l, double w) {
        length = l;
        width = w;
    }
    void getArea() {
        System.out.println("Box Area: " + (length * width));
    }
}

class Round extends Shape {
    double radius;
    Round(double r) {
        radius = r;
    }
    void getArea() {
        System.out.println("Round Area: " + (Math.PI * radius * radius));
    }
}

public class Lab7_q1 {
    public static void main(String[] args) {
        Box box = new Box(5, 10);
        Round round = new Round(7);
        box.getArea();
        round.getArea();
    }
}
