class Demo {
    int value;

    Demo(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class Main_21{
    public static void main(String[] args) {
        Demo obj1 = new Demo(10);

        Demo obj2 = obj1;

        obj1.display();
        obj2.display();

        obj2.value = 50;

        System.out.println("After modifying using obj2:");

        obj1.display();
        obj2.display();
    }
}
