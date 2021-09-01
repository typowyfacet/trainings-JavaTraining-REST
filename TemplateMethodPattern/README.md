# Template Method Pattern

Template Method Pattern is one of behavioral design patterns.

The template method is a method in a superclass, usually an abstract superclass, and defines the skeleton of an operation in terms of a number of high-level steps. 
These steps are themselves implemented by additional helper methods in the same class as the template method.

The helper methods may be either abstract methods, for which case subclasses are required to provide concrete implementations, or hook methods, which have empty bodies in the superclass. 
Subclasses can (but are not required to) customize the operation by overriding the hook methods. The intent of the template method is to define the overall structure of the operation, while allowing subclasses to refine, or redefine, certain steps.

Composition (like Strategy Pattern) should be favored over inheritance (like Template Method) unless you have scenario that structure of your algorithm is not variant.


### Template Methods in Java Core Libraries

This pattern is widely used in the Java core libraries, for example by `java.util.AbstractList`, or `java.util.AbstractSet`.

For instance, Abstract List provides a skeletal implementation of the List interface.

An example of a template method can be the `addAll()` method, although it's not explicitly defined as final.

### Usage

The template method is used in frameworks, where each implements the invariant parts of a domain's architecture, while providing hook methods for customization. This is an example of inversion of control. The template method is used for the following reasons.

* It lets subclasses implement varying behavior (through overriding of the hook methods).
* It avoids duplication in the code: the general workflow of the algorithm is implemented once in the abstract class's template method, and necessary variations are implemented in the subclasses.
* It control the point(s) at which specialization is permitted. If the subclasses were to simply override the template method, they could make radical and arbitrary changes to the workflow. In contrast, by overriding only the hook methods, only certain specific details of the workflow can be changed, and the overall workflow is left intact.

### Flow diagram

![Flow Diagram](TemplateMethodPattern.jpg)

**Abstract Class**:
* House

**Concrete Class (SubClass)**:
* BrickHouse
* CobblestoneHouse
* WoodenHouse

### YouTube link

[![Youtube Link](http://img.youtube.com/vi/7ocpwK9uesw/0.jpg)](https://www.youtube.com/watch?v=7ocpwK9uesw)