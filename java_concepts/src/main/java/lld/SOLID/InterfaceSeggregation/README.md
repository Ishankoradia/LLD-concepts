This principle dictates the following things
- Interface should be as light as possible
- Interface should have as less methods as possible
- Interface should ideally have only 1 method - these interfaces are called `Functional Interface`

Example; Lets say the following are product requirements for design a bird software
- Some birds can fly
- Some birds can dance
- All birds who can fly can also dance & vice -versa

From the below approaches which makes more sense
1. Creating an interface `<<FlyDance>>`
2. Creating interfaces `<<Fly>>` and `<<Dance>>`


2. works better because tomorrow there might be a requirement change tomorrow that there are other birds who can fly but not dance