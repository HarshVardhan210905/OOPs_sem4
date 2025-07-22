interface EventHandler {
    void handleEvent();
}

public class lab8_q3 {
    public static void main(String[] args) {
        lab8_q3 demo = new lab8_q3();
        demo.registerEvent();
    }
    
    public void registerEvent() {
        class Local_Inner_Class implements EventHandler {
            @Override
            public void handleEvent() {
                System.out.println("Event handled by local inner class");
            }
        }
        Local_Inner_Class localHandler = new Local_Inner_Class();
        localHandler.handleEvent();
        // Anonymous Class
        EventHandler Anonymous_Class = new EventHandler() {
            @Override
            public void handleEvent() {
                System.out.println("Event handled by anonymous inner class");
            }
        };
        Anonymous_Class.handleEvent();
    }
}
