
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");

        Animal animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();

    }
}

class Dog implements  Animal{
    @Override
    public void sound() {
        System.out.println("bark");
    }
}

class  Cat implements  Animal{
    @Override
    public void sound() {
        System.out.println("meow");
    }
}