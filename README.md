## Java Bootcamp2025

This session covered core Java concepts that form the foundation of object-oriented programming.

### Topics Covered

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
