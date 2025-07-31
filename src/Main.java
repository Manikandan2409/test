
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");



        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        String s = "Deva raja mannar";
        System.out.println(s);



        Animal animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();

        int k =10;
        while (k>10){
            System.out.println(k--);
        }
        System.out.println("Exit");
    }
}

class Dog implements  Animal{
    @Override
    public void sound() {
        System.out.println("bark bark");
    }
}

class  Cat implements  Animal{
    @Override
    public void sound() {
        String so ="meow meow";
        System.out.printf("%s",so);
    }
}