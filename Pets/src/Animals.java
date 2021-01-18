public class Animals {
    public static void main(String[] agrs) {
        Dog dog = new Dog("Lucky", "Poddle", "Brown", 2);
        dog.size = "Small";
        dog.hair = "Short";
        dog.ShowPetData();
        dog.Run();
        dog.Bark();
        dog.isShortHair();

        Fish fish = new Fish("Kiki","Koi","Red",5);
        fish.speed="100";
        fish.water="Salt water";
        fish.size="Small";
        fish.ShowPetData();
        fish.IsSwimToTheSea();
        fish.SwimFast();

        Birds bird = new Birds("Lili","Parrot","Green",3);
        bird.country="American";
        bird.fly="C TO B";
        bird.ShowPetData();
        bird.Speak();
        bird.CheckCountry();
        bird.IsCanFly();
    }
}
