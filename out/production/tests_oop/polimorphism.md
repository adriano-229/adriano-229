In Java, there are two main types of polymorphism:

1. **Compile-time Polymorphism (Static Polymorphism)**:
    - Achieved through method overloading and operator overloading (SOBRECARGA de PARÁMETROS y MÉTODOS).
    - The method to be invoked is determined at compile time.

2. **Runtime Polymorphism (Dynamic Polymorphism)**:
    - Achieved through method overriding (SOBREESCRITURA de MÉTODO).
    - The method to be invoked is determined at runtime based on the object's actual type.

Here's a brief explanation of each:

### Compile-time Polymorphism

This type of polymorphism is resolved during the compilation of the program. It is achieved by method overloading, where
multiple methods have the same name but different number and/or type of parameters.

Example:

```java
public class CompileTimePolymorphism {
    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    public void display(String a) {
        System.out.println("Argument: " + a);
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.display(10);
        obj.display("Hello");
    }
}
```

### Runtime Polymorphism

This type of polymorphism is resolved during the runtime of the program. It is achieved by method overriding, where a
subclass provides a specific implementation of a method that is already defined in its superclass.

Example:

```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();  // Outputs: Dog barks
    }
}
```