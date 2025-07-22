class Guest{
    void read(){
        System.out.println("read only");

    }
}
class Developer extends Guest{
    void write(){
        System.out.println("write only");
    }    
}
class Admin extends Developer{
    void arrange(){
        System.out.println("arrange only");
    }
    void manage(){
        read();
        write();
        System.out.println("manage");
    }
    void read(){
        System.out.println("read in admin");

    }
}
public class multclass {
    public static void main(String[] args) {
        Guest guest = new Guest();
        Developer dev = new Developer();
        Admin admin = new Admin();
        guest.read();
        dev.write();
        admin.read();
    }
}