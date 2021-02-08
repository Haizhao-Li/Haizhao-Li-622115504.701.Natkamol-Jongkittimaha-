public class Ball extends Person {
    String workstate;
    public Ball(String name,int bornYear,String worstate){
        super(name,bornYear);
        this.workstate=worstate;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I am a teacher and work in "+workstate+".");
    }
}
