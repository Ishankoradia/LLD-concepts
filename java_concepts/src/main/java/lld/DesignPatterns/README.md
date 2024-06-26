1. Creational Desgin Patterns - These patterns talk about how or how many object(s) will be created

    1. **Singleton design pattern**: Allows us to create a class for which only 1 object can be created

        What is the need to create one object ?

        - Logger, Db connection. These objects need not be initialized again & again. Especically db connection since its is a heavy object, it requires opening up tcp connections to database. 

        - Shared resources behind the scenes. For example, db connection object can be shared across the application

    2. **Builder pattern**: This is the pattern where we handoff the object creation to a helper/builder class. When can we use such a design pattern
        - When we want to create a complex object - object of a class with lots of attributes & can lead constructor explosion at some time

        - The object of the class should only be created after certain validations

    3. **Prototype and registry**: This pattern is used when we want to create multiple objects of an entity with minor configuration changes but with the same base attributes. For such cases, we create base templates (called `Prototype`) using which we can build those multiple objects with some minor changes. We store these `Prototypes` in a hash map called `Registry`.

    4. **Factory pattern**: Factory Method Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass, allowing subclasses to alter the type of objects that will be created. It encapsulates object creation logic in a separate method, promoting loose coupling between the creator and the created objects. This pattern is particularly useful when the exact types of objects to be created may vary or need to be determined at runtime, enabling flexibility and extensibility in object creation.

    The example should make things clear

2. Structural Design Patterns - These patterns will talk about how to structure your code base

    1. **Adapter pattern**: is a structural design pattern that allows objects with incompatible interfaces to collaborate. Basically, we call the adapter a layer that converts one form to another. A phrase that is very applicable here is "Never code to implementation, code to interface" (loosely coupled code).

    2. **Facade pattern**: is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes. In literal terms, a facade is something that appears from the outside. This basically refactoring into a helper or service or util class to make code more readable & modular.

    3. **Decorator**: is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

    4. **Flyweight**: is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object. The object is divided into `intrinsic` state (shared & independent of the context) and `extrinsic` state (variable & dependent on context). We can use `registry` to store the `intrinsic` objects. The idea is we are expecting to have a lot of extrinsic objects with references to their respective intrinsic objects



3. Behavioural Design Patterns