class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        id = 0;
        name = "Unknown";
        salary = 0.0;
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class Main_17{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Sneha");
        Employee e3 = new Employee(102, "Riya", 50000);

        e1.display();
        e2.display();
        e3.display();
    }
}
