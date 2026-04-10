class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }
}

public class Main_15{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        double area = r.calculateArea();
        System.out.println("Area of Rectangle: " + area);
    }
}
