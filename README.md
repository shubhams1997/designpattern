# Design Pattern from Head First Design Pattern Book

- Language used : java

## Design Patterns

### 1. Strategy Pattern
> The Strategy Pattern defines a family of algorithms, ecapsulates each one, and makes them interchangable. Strategy lets the algorithm vary independetly from clients that use it.

![Strategy Pattern](images/StrategyPattern.png)

### 2. Observer Pattern
> The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and update automatically.

![Observer Pattern](images/ObserverPattern.png)

### 3. Decorator Pattern
> The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

![Decorator Pattern](images/DecoratorPattern.png)

### 4. Singleton Pattern
> The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

### 5. Command Pattern
> The Command Pattern encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

![Command Pattern](images/CommandPattern.png)

### 6. Adapter Pattern
> The Adapter Pattern converts the interface of a class into another interface the client expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

![Adapter Pattern](images/AdapterPattern.png)

### 7. Facade Pattern
> The Facade Pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher level interface that makes the subsystem easier to use.

### 8. Proxy Pattern
> The Proxy Pattern provides a surrogate or placeholder for another object to control access to it.

![Proxy Pattern](images/ProxyPattern.png)


### 9. Template Method Pattern
> The Template Method defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

![Template Method Pattern](images/TemplatePattern.png)


## Design Principles

1. Identify the aspects of your application that vary and separate them from what stays the same.
	> Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't.

2. Program to an interface, not an implementation.
	> The point is to exploit polymorphism by programming to a supertype so that the actual runtime object isn’t locked into the code. We delegate the behaviors insted of defining it inside its class.

3. Favor composition over inheritance.
	> HAS-A can be better then IS-A. It will let you change behaviour at runtime as long as the object you're composing with implements the correct behaviour interface.

4. Stive for loosely coupled designs between objects that interact.
	> Loosely coupled designs allow us to build flexible OO Systems that can handle change because they minimize the interdependency between objects.

5. The Open-Closed Principle.
	> Classes should be open for extension, but closed for modification.

6. The Dependency Inversion Principle.
	> Depend on abstractions. Do not depend on concretion.

7. The Principle of least knowledge.
	> Principle of Least Knowledge - talk only to your immediate friends.

8. The Hollywood Principle.
	> Don't call us, we'll call you.


