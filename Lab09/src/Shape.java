public class Shape {
    private String S;
    public Shape(String S){
        this.S = S;
    }
    public void intro(){
        System.out.println("This is a"+S);
    }
    public String toString(){
        return "This is a"+S;
    }

    public static void main(String[] args) {
    Shape s = new Shape("Shape");
    System.out.println(s.toString());
    }
}
