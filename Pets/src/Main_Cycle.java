public class Main_Cycle {
    public static void main(String[] args) {
        bicycle N = new bicycle(10,5);
        N.SetSpeed(5);
        N.Speedup();
        N.SetSpeed(80);
        N.Speedup();
        N.Break();
        System.out.println("===||===");
        Mountainbike B = new Mountainbike(10,5);
        B.SetSpeed(40);
        B.gear(2);
        B.Speedup();
        B.SetSpeed(2);
        B.Break();
        B.Speedup();


    }
}
