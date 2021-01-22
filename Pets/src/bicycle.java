public class bicycle extends Cycle{
    public bicycle(){

    }
    public bicycle(int i,int b) {
    this.CurrentSpeed=i;
    this.Speeddown=b;

    }
    public void Break() {
        if (this.CurrentSpeed - this.speed <0) {
            System.out.println("Wrong!!!It's less than 0");
        }else {
            this.CurrentSpeed = this.CurrentSpeed - this.Speeddown;
            System.out.println("Break!!!The speed is "+CurrentSpeed);
        }
    }
    public void Speedup() {
        if (this.CurrentSpeed + this.speed > 99) {
            System.out.println("Wrong!! It's more than 99km/hours");
        }else {
            this.CurrentSpeed = this.CurrentSpeed + this.speed;
            System.out.println("Speed up!!!The speed is "+CurrentSpeed);
        }
    }

}
