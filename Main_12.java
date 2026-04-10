class Student {
    String name;
    int age;

    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main_12{
    public static void main(String[] args) {
        // Creating object
        Student s1 = new Student("Sneha", 20);

        // Displaying values
        s1.display();
    }
}