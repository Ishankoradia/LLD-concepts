1. Creational Desgin Patterns

    1. **Singleton design pattern**: Allows us to create a class for which only 1 object can be created

        What is the need to create one object ?

        - Logger, Db connection. These objects need not be initialized again & again. Especically db connection since its is a heavy object, it requires opening up tcp connections to database. 

        - Shared resources behind the scenes. For example, db connection object can be shared across the application

    2. **Builder pattern**: This is the pattern where we handoff the object creation to a helper/builder class. When can we use such a design pattern
        - When we want to create a complex object - object of a class with lots of attributes & can lead constructor explosion at some time

        - The object of the class should only be created after certain validations

    The example should make things clear

2. Structural Design Patterns

3. Behavioural Design Patterns