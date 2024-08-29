// Define the superclass Animal
class Animal1{
    // Method that will be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Define the subclass Dog
class Dog extends Animal1 {
    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Define the subclass Cat
class Cat extends Animal1 {
    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to demonstrate the overriding
public class Animal {
    public static void main(String[] args) {
        // Create objects of each class
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Display the sound each animal makes
        System.out.println("Generic Animal:");
        genericAnimal.makeSound();

        System.out.println("\nDog:");
        dog.makeSound();

        System.out.println("\nCat:");
        cat.makeSound();
    }

    @Override
    public String toString() {
        return "Main []";
    }
}
