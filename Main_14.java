class Demo {
    int x;
    String name;

    Demo() {
        x = 0;
        name = "Default";
    }

    Demo(int x, String name) {
        this.x = x;
        this.name = name;
    }

    void display() {
        System.out.println("Value of x: " + x);
        System.out.println("Name: " + name);
    }
}

public class Main_14{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(10, "Sneha");

        d1.display();
        d2.display();
    }
}
