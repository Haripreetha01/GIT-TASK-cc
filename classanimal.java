class Animal {
    String color = "White";

    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    String color = "Brown";

    void displayColors() {
        // Accessing the color variable of the parent class using super
        System.out.println("Dog Color: " + color);  // Color of Dog class
        System.out.println("Animal Color: " + super.color);  // Color of Animal class

        // Calling the eat() method of the parent class using super
        super.eat();
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.displayColors();
    }
}
