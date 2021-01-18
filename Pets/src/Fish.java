public class Fish extends Pets {
    String size;
    String water;
    String speed;

    public Fish(String name, String species, String color, int age) {
        System.out.println("My fish");
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void IsSwimToTheSea() {
        System.out.println("Size : " + this.size);
        if (this.water.equals("Salt water") || this.water.equals("salt water") || this.water.equals("Fresh water")
                || this.water.equals("fresh water")) {
            System.out.println(name + " is swim in " + water);
        } else {
            System.out.println("Check information again");
        }
    }

    public void SwimFast() {
        System.out.println("Look at that he swiam at " + speed + " per hour !");
    }
}
