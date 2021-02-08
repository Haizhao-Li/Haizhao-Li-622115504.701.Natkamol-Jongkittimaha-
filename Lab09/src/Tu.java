public class Tu extends Person {
    String workstate;
    public Tu(String name,int bornYear,String worstate){
        super(name,bornYear);
        this.workstate=worstate;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I am a prime minister and work in "+workstate+".");
    }
}