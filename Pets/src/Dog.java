public class Dog extends Pets {
    String size;
    String hair;

    public Dog(String Name, String Species, String Color, int Age) {
        System.out.println("My dog");
        this.name = Name;
        this.species = Species;
        this.color = Color;
        this.age = Age;
    }

    public void Run() {
        System.out.println("My dog " + name + " run to the forest ");
    }

    public void Bark() {
        System.out.println(size + " bark Box Box!!");
    }

    public void isShortHair() {
        if (this.hair.equals("short") || this.hair.equals("Short")) {
            System.out.println("Short hair : true");
        } else {
            System.out.println("Short hair : false");
        }
    }
}
