# Prototype Pattern for Object Cloning in Testing

## Problem Statement
You are developing a testing framework for a user API of a social media platform. Each test case requires generating multiple mock users with different attributes to simulate various scenarios. However, creating mock users for testing involves complex setups and is time-consuming. To optimize the user creation process during testing, you decide to implement the Prototype pattern. This pattern allows you to create prototype objects and clone them when needed, avoiding the overhead of setting up complex user objects repeatedly.

## Assignment
Your task is to implement the Prototype pattern to create prototype objects for mock users in the testing framework. You should define an `ClonableObject` interface that contains the `clone` method, which should be implemented by user objects. Additionally, you need to create a `UserPrototypeRegistry` interface that provides methods for adding and retrieving user prototypes and for cloning user objects. The goal is to streamline the process of creating mock users for testing.
