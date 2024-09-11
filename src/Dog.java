import java.util.Locale;

public class Dog {

    //Instance variables
    private String breed;
    private String name;
    private int age;

    //Constructor - next class
    public Dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    //Methods

    //Has the dog move forward
    public void walk(){}

    //Has the dog walk to a certain location
    public void walk(Locale stop, String test){}

    //Has the dog walk around a certain location
    public void walk(String treat, Locale avoid){}
}
