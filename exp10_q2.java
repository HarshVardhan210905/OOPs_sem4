import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class exp10_q2 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 101, 50000));
        employees.add(new Employee("Bob", 102, 60000));
        employees.add(new Employee("Charlie", 103, 55000));

      
        for (Employee emp : employees) {
            if (emp.id == 102) {
                emp.salary = 65000; 
                break;
            }
        }

    
        employees.removeIf(emp -> emp.id == 101);

     
        System.out.println("Remaining Employees:");
        for (Employee emp : employees) {
            emp.display();
        }
    }
}
