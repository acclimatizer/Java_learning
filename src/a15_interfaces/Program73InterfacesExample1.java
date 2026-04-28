package a15_interfaces;

interface Animal {
    void makeSound();
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("meow meow");
    }
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("bow bow");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();

        Dog d = new Dog();
        d.makeSound();
    }
}