1. Creational Desgin Patterns

    **Singleton design pattern**: Allows us to create a class for which only 1 object can be created

    What is the need to create one object ?

    - Logger, Db connection. These objects need not be initialized again & again. Especically db connection since its is a heavy object, it requires opening up tcp connections to database. 

    - Shared resources behind the scenes. For example, db connection object can be shared across the application


    