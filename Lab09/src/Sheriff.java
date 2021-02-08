public class Sheriff extends Person {
    String workstate;
    public Sheriff(String name,int bornYear,String worstate){
        super(name,bornYear);
        this.workstate=worstate;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I am a sheriff and work in "+workstate+".");
    }
}
