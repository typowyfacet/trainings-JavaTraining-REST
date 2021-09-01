# Builder Pattern

The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex object from its representation

The Builder design pattern describe how to solve recurring design problems in object-oriented software.

The intent of the Builder design pattern is to separate the construction of a complex object from its representation. By doing so the same construction process can create different representations.

### What problems the Builder Pattern solves?

The Builder design pattern solves problems like:

* How can a class (the same construction process) create different representations of a complex object?
* How can a class that includes creating a complex object be simplified?

Creating and assembling the parts of a complex object directly within a class is inflexible. It commits the class to creating a particular representation of the complex object and makes it impossible to change the representation later independently from (without having to change) the class.

The Builder design pattern describes how to solve such problems:
* Encapsulate creating and assembling the parts of a complex object in a separate Builder object.
* A class delegates object creation to a Builder object instead of creating the objects directly.

A class (the same construction process) can delegate to different Builder objects to create different representations of a complex object.

### Advantages and disadvantages of Builder Pattern

Advantages of the Builder pattern include:

* Allows you to vary a product’s internal representation.
* Encapsulates code for construction and representation.
* Provides control over steps of construction process.

Disadvantages of the Builder pattern include:
* Requires creating a separate ConcreteBuilder for each different type of product.
* Requires the builder classes to be mutable.
* Data members of class aren't guaranteed to be initialized.
* Dependency injection may be less supported.

### Flow diagram
![Flow diagram](BuilderPattern.png)

**Director:** 
* Waiter

**Builder:**
* PizzaBuilder

**ConcreteBuilder:** 
* ChicagoPizzaBuilder, 
* HawaiianPizzaBuilder, 
* PepperoniPizzaBuilder, 
* QuattroFromaggiPizzaBuilder

**Product**:
* Pizza
