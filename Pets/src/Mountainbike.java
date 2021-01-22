public class Mountainbike extends Cycle{
    int g;
    public Mountainbike(){

    }
    public Mountainbike(int i,int b){
        this.CurrentSpeed=i;
        this.Speeddown=b;

    }

    public void gear(int i) {
        g=i;
    }
    public void Break() {
        if (this.CurrentSpeed - this.speed <0) {
            System.out.println("Wrong!!!Less than 0");
        }else {
            this.CurrentSpeed = this.CurrentSpeed - this.Speeddown;
            System.out.println("Break!!!The speed is "+CurrentSpeed);
        }
    }
    public void Speedup(){
            if (this.CurrentSpeed + this.speed*g > 99) {
                System.out.println("Wrong!!!More than 99");
            }else {
                this.CurrentSpeed = this.CurrentSpeed + this.speed*g;
                System.out.println("Speed up!!!The speed is"+CurrentSpeed);
            }

    }
}
