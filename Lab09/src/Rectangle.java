public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(String S,int width,int height) {
        super(S);
        this.height=height;
        this.width=width;
    }
    public String toString(){
        super.intro();
        return "with width as  "+width+"  and heigh as "+height;
    }

    public static void main(String[] args) {
        Rectangle r =new Rectangle("Rectangle",14,59);
        System.out.println(r.toString());
    }
}
