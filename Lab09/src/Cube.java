public class Cube extends Rectangle{
    private int length;
    public Cube(String S, int width, int height,int length) {
        super(S, width, height);
        length =width;
        this.length=length;
    }

    public String toString(){
        super.intro();
        return "The side of the length is "+length;
    }

    public static void main(String[] args) {
        Cube c = new Cube("Cube",5,5,0);
        System.out.println(c.toString());
    }
}
