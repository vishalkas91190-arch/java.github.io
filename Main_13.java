class Car {
    String model;
    int year;
    double price;

    Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}

public class Main_13{
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2022, 1500000);
        c1.display();
    }
}