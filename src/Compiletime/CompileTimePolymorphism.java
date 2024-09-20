package Compiletime;

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.display(10);
        obj.display("Hello");
    }

    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    public void display(String b) {
        System.out.println("Argument: " + b);
    }
}