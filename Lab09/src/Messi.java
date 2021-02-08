public class Messi extends Person {
    String workstate;
    public Messi(String name,int bornYear,String worstate){
        super(name,bornYear);
        this.workstate=worstate;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I am a football player and work in "+workstate+".");
    }
}