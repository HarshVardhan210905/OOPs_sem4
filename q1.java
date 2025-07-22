// class Worker implements Runnable{
//     string name;
//     public Worker(string name){
//         this.name = name;
//     }
//     public void run(){
//         System.out.println("is working");
//         try {
//             Thread.sleep(2000);
//         } 
//         catch (InterruptedException e) {
//             System.out.println("Exception");
//         }
//         System.out.println("Finished works");
//     }
// }
// class Chef extends Worker{
//     public Chef(string name){
//         super(name);
//     }
//     @Override
//     public void run(){
//         System.out.print("cooking finished");
//     }
// }
// public class classq1 {
//     public static void main(String[] args) {
//         Chef chef = new Chef("Chef ABC");
//         Thread chefThread = new Thread(chef);
//         chefThread.start();
//         System.out.println("Mian thread: taking new order");
//     }
// }
class Worker implements Runnable {
    String name;
    public Worker(String name) {
        this.name = name;
    }
    public void run(){
        System.out.println("is working");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception");
        }
        System.out.println("Finsished work");
    }
}

class Chef extends Worker{
    public Chef(String name) {
        super(name);
    }
    @Override
    public void run(){
        System.out.println("cooking finished");
    }
}



public class q1 {
    public static void main(String[] args) {
        Chef chef = new Chef("Chef ABC");
        Thread chefThread = new Thread(chef);
        chefThread.start();
        System.out.println("Mian thread: taking new order");
    }
}