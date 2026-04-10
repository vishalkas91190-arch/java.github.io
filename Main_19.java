class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 0);
    }

    Student(String name) {
        this(name, 18);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class Main_19{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sneha");
        Student s3 = new Student("Riya", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}