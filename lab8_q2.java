public class lab8_q2 {
    class Engine {
        void start() {
            System.out.println("Engine started");
        }
        void stop() {
            System.out.println("Engine stopped");
        }
    }
    void drive() {
        Engine engine = new Engine();
        engine.start();
        engine.stop();
    }
    public static void main(String[] args) {
        lab8_q2 myCar = new lab8_q2();
        myCar.drive();
    }
}

