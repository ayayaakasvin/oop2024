package Lab3.first;

abstract class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType () {
        return type;
    }

    public abstract void makeSound();

    public void printInformation() {
        System.out.printf("This is %s called %s.\n", type, name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name, "dog");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name, "cat");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}

public class AbstractClassUsage {
    public static void main(String[] args) {
        Animal dogge = new Dog("Aktos");
        Animal catte = new Cat("Murik");

        dogge.printInformation();
        dogge.makeSound();

        System.out.println();

        catte.printInformation();
        catte.makeSound();
    }
}