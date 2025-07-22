public class lab5cont_q3 {
    public static void main(String[] args) {
        
    }
}
class Vehicle{
    String brand;
    String model;
    int price;
}

class Car extends Vehicle{
    int seatingCapacity;
    String fuelType;
}

class ElectricCar extends Car{
    int batteryCapacity;
    int chargingTime;
    
}

class motorcycle extends Vehicle{
    int engineCapacity;
    String type;
}