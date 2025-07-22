
public interface Vehicle {
    void start();
    void stop();
public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}
class Main {
    public static void main(String[] args) {

        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();


        System.out.println("Demonstrating Car functionality:");
        myCar.start();
        myCar.stop();

        System.out.println("\nDemonstrating Bike functionality:");
        myBike.start();
        myBike.stop();
    }x
}
