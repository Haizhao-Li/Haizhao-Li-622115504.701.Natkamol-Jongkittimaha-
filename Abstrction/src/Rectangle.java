public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        System.out.println("This recatangle have width = "+width +" lenght " + length);
    }
    public double getArea() {
        return width*length;
    }

}