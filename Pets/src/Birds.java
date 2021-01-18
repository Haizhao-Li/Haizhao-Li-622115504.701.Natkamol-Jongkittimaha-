public class Birds extends Pets {
    String country;
    String fly;

    public Birds(String name, String species, String color, int age) {
        System.out.println("My Bird");
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void Speak(){
        System.out.println(name +" is special bird it can speak 5 laguage");
    }
    public void CheckCountry(){
        System.out.println(name +" is from "+country);
    }
    public void IsCanFly(){
        System.out.println(name+" is special it can "+fly+" !!!! ");
    }
}
