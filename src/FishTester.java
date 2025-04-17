public class FishTester {
    // Main class to test
    public static void main(String[] args) {
        Fish myFish = new Fish("Nemo");
        myFish.eat(); // Calls the overridden eat() method in Fish
        myFish.swim();

        Animal myAnimal = new Animal("Generic Animal");
        myAnimal.eat(); // Calls the eat() method in Animal

    }
}