
public interface Laptop{
    public void copy();
    public void paste();
    public void cut();
}
class Lenovo implements Laptop{
    public void copy(){
        System.out.println("copy code");
    }
    public void paste(){
        System.out.println("paste code");
    }
    public void cut(){
        System.out.println("cut code");
    }
}
class json{
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.copy();
        lenovo.paste();
        lenovo.cut();
    }
}