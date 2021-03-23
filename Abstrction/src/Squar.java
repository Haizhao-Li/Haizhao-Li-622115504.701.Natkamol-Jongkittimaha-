public class Squar extends Shape {
    private double side;

    public Squar(double side) {
        this.side = side;

        System.out.println("This recatangle have side = " + side);
    }

    public double getArea() {
        return side * side;
    }
}