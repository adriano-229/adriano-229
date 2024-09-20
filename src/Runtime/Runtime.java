package Runtime;

public class Runtime {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myOwl = new Owl();
        Animal myDog = new Dog();

        myAnimal.sound();
        myOwl.sound();
        myDog.sound();
    }

}
