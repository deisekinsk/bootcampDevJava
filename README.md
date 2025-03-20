## Java Bootcamp2025

This session covered core Java concepts that form the foundation of object-oriented programming.

### Topics Covered

### Part 1

- **Void (Return Type)**: A method that does not return any value.
- **Abstract Class**: A class that cannot be instantiated directly.
- **Abstract Method**: A method that must be implemented by subclasses.
- **Extends (Inheritance)**: Allows a class to reuse and extend the functionality of a superclass.
- **Test Class**: Used to instantiate objects and test methods of other classes.
- **@Override**: An annotation used to indicate that a method has been overridden in a subclass, helping to avoid syntax errors.
- **Package Implementation**: Demonstrated the implementation of abstract classes, anonymous classes, and interfaces in various scenarios.
- **Anonymous Class**: A class without a name, instantiated directly.

  ```java
    
  abstract class Animal {
    abstract void makeSound(); // Abstract method

    void breathe() { // Concrete method
        System.out.println("Breathing...");
    }
  
  //anonymous class
    Account savingsAccount = new Account(){
        @Override
        public void printAccountType() {
            System.out.println("Savings Account");
        }
    };

### Part 2

- **Access Modifiers**: Define the visibility and accessibility of classes, methods, and variables in Java.

![Modifiers Types in Java](https://media.geeksforgeeks.org/wp-content/uploads/20220504160344/ModifiersTypesInJavapng.jpg)

- **Lombok**: A Java library that reduces boilerplate code by automatically generating common methods.
  - `@Getter` / `@Setter` → Generates getter and setter methods.
  - `@AllArgsConstructor` → Creates a constructor with all fields.
  - `@NoArgsConstructor` → Creates a no-argument constructor.
  - `@Builder` → Enables the builder pattern.
![Lombok Annotations](https://javatechonline.com/wp-content/uploads/2020/09/Lombok-Annotations-1.jpg)


- **LocalDate**: A class from `java.time` used for handling dates without time zones.

### Example Code

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        LocalDate customDate = LocalDate.of(2025, 3, 19);
        System.out.println("Custom Date: " + customDate);

        LocalDate futureDate = today.plusDays(10);
        System.out.println("Future Date: " + futureDate);

    }
}

