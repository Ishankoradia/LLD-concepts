# Flyweight Pattern for Chess User Optimization

## Problem Statement

You are developing a chess game application where you need to represent individual chess users with various attributes like name, age, gender, email, and more.
One user can play multiple games simultaneously. At the moment, you create a new user object for each game.
Each user object consumes memory, and you want to optimize the memory usage by only keeping one copy of fields that do not change.

You need to implement the Flyweight pattern to efficiently manage and reuse shared attributes while keeping individual user-specific data separate.

## Assignment

Your task is to implement the Flyweight pattern to optimize the memory usage of chess user objects in your application. The Flyweight pattern aims to share common intrinsic state between multiple objects to reduce memory consumption while keeping extrinsic state (variable and context-dependent) separate for each object.
Look closely at the `ChessUser` class and identify which fields are going to be different amongst different games and which ones will be the same.
