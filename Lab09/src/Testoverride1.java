public class Testoverride1 {
    public static void main(String[] args) {
        Person person1;
        Person person2;
        Person person3;
        Person person4;
        Person person5;
        person1 = new Person("Mark",2001);
        person2 = new Sheriff("Meteo",1988,"California");
        person3 = new Ball("Ball",1977,"CMU");
        person4 = new Messi("Messi",1987,"Barcelona football club");
        person5 = new Tu("TU",1954,"Thailand");

        person1.introduce();
        person2.introduce();
        person3.introduce();
        person4.introduce();
        person5.introduce();
    }
}
