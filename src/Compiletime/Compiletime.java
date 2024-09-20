package Compiletime;

public class Compiletime {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(3);

        Feline tiger = new Feline();
        tiger.sound(3);
        tiger.sound("John");

        Cat mishi = new Cat();
        mishi.sound(1234);
        mishi.sound("Carlos Alberto");
        mishi.sound();

    }
}
