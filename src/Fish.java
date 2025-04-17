// Interface definition
interface Swimmable {
    void swim();
}

// Superclass (Base class)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass (Derived class) inheriting from Animal and implementing Swimmable
class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void eat() {
        System.out.println(name + " is eating fish food.");
    }
}