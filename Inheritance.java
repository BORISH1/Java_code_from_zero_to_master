package Java_code_from_zero_to_master;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Inheritence 
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();

        Dog myDog = new Dog();
        myDog.sound();
    }
}
