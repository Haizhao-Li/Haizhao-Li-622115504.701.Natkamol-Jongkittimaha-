public class MainShape {
    public static void main(String[] agrs) {

        Shape square = new Squar(10);
        System.out.println(square.getArea());

        Shape rectangle = new Rectangle(3, 8);
        System.out.println(rectangle.getArea());

        Shape Triangle = new Triangle(9, 4);
        System.out.println(Triangle.getArea());


    }
}
