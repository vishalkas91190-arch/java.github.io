class Box {
    double height;
    double width;
    double depth;

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    double calculateVolume() {
        return height * width * depth;
    }
}

public class Main_20{
    public static void main(String[] args) {
        Box b1 = new Box(2, 3, 4);
        Box b2 = new Box(5, 6, 7);
        Box b3 = new Box(1.5, 2.5, 3.5);

        System.out.println("Volume of Box 1: " + b1.calculateVolume());
        System.out.println("Volume of Box 2: " + b2.calculateVolume());
        System.out.println("Volume of Box 3: " + b3.calculateVolume());
    }
}