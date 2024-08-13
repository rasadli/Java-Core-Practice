# Rashad Asadli 17960 20417

#### On 16 th of Febuary during the Seminar Session we changed the week03/geometry (Point.java,Segment.java) due to the statemnt of the 17 question from week04 named Array of Segments

#### On 18 th of Febuary due to the 18 th task in week04 folder ,I updadated the week03 classes by adding toString method to them  

## Week05


### Task1

#### The output of the given code will be "In constructor X." and then it will print "In constructor Y.", because the Y extends from X .First X class constructor work then Y's constructor when 'y' initialized.


### Task2

#### First, static initialization blocks are executed. So, "In static init block of A" is printed, followed by "In static init block of B".

#### Then, when an instance of class B is created, the instance initialization blocks and constructors of both classes A and B are executed in order. So, "In instance init block of A" is printed, followed by "In constructor A.", then "In instance init block of B" is printed, followed by "In constructor B.".


### Task3

#### child.calcValue(5) calls the calcValue(int a) method from the Parent class, printing "Super" and returning 5 * 2, which is 10.

#### child.calcValue(5, 10) calls the calcValue(int a, int b) method from the Child class, printing "Subclass" and returning (5 + 10) * 2, which is 30.\


### Task4
#### AS is printed because it is the static initialization block of class A, which is executed when the class is loaded into memory.

#### GTS is printed because it is the static initialization block of class GeneralType, which is executed when the class is loaded into memory.

##### 5 AC is printed because the constructor public A(int x) is called in the constructor of GeneralType using super(5), which prints the integer 5 followed by "AC".

#### GT is printed because it is the instance initialization block of class GeneralType, which is executed during the object's construction.

#### GTC is printed because it is the constructor of class GeneralType, which is executed after the initialization blocks and superclass constructor calls.

### Task 5

#### 1. Single inheritance refers to the scenario where a subclass inherits from only one superclass.

     ```java
     class Animal {
         void eat() {
             System.out.println("Animal is eating");
         }
     }
     
     class Dog extends Animal {
         void bark() {
             System.out.println("Dog is barking");
         }
     }
     ```

#### 2. Multilevel inheritance refers to a chain of inheritance where a subclass becomes the superclass for another subclass.
     ```java
     class Animal {
         void eat() {
             System.out.println("Animal is eating");
         }
     }
     
     class Dog extends Animal {
         void bark() {
             System.out.println("Dog is barking");
         }
     }
     
     class Puppy extends Dog {
         void play() {
             System.out.println("Puppy is playing");
         }
     }
     ```

#### 3. Hierarchical inheritance occurs when multiple subclasses inherit from the same superclass.

     ```java
     class Animal {
         void eat() {
             System.out.println("Animal is eating");
         }
     }
     
     class Dog extends Animal {
         void bark() {
             System.out.println("Dog is barking");
         }
     }
     
     class Cat extends Animal {
         void meow() {
             System.out.println("Cat is meowing");
         }
     }
     ```



#### 4. Multiple inheritance refers to a scenario where a subclass inherits from more than one superclass.

     ```java
     class Animal {
         void eat() {
             System.out.println("Animal is eating");
         }
     }
     
     class Mammal {
         void walk() {
             System.out.println("Mammal is walking");
         }
     }
     
     class Dog extends Animal, Mammal { // This syntax is not supported in Java
         void bark() {
             System.out.println("Dog is barking");
         }
     }
     ```


#### 5. Hybrid inheritance is a combination of two or more types of inheritance.

     ```java
     class Animal {
         void eat() {
             System.out.println("Animal is eating");
         }
     }
     
     class Dog extends Animal {
         void bark() {
             System.out.println("Dog is barking");
         }
     }
     
     class Puppy extends Dog {
         void play() {
             System.out.println("Puppy is playing");
         }
     }
     
     class Cat extends Animal {
         void meow() {
             System.out.println("Cat is meowing");
         }
     }
     ```

### Task6 

#### MethodOne: this one is not overriding, rather an invalid attemp to hide an instance method with static method. This will result in compile-time error. MethodTwo: Here both method are instance methods that is why subclass method will override the one in superclass. MethodThree: It will also be like the one in MethodOne since it is not properly defined. MethodFour: Here, both are static methods and there will be Hiding. 

#### MethodOne: Compile-Time error
#### MethodTwo: Override
#### MethodThree: Compile-Time error
#### MethodFour: Hiding

### Task 7

####  Static methods can be used without creating an instance and static methods belong to the class, loaded into memory only once, saving memory compared to instance methods

### Task 10
#### On 24 Febuary I changed week03/geometry/Point.java due to the 10 th task in week05


## Week 06

#### While writing the code during class on 2.28.24 we changed Rectangle.java fro achieving the result

### Task 4 

#### a. The clone() method in the Object class is protected to prevent unrestricted access to cloning. Allowing unrestricted access could lead to security vulnerabilities or unintended object state changes.

#### b. It permits subclasses to override the clone() method,It prevents unintended use of cloning in subclasses.

### Task 7

#### In task 7, the statement asked to modify the existing Rectangle, Circle, and Square classes. However, modifying the existing files directly could disrupt their functionality and deviate from the UML diagram provided in the task description. To address this issue, I created new versions of these classes within the shape folder of week06. These new classes have been adjusted according to the task requirements, and they align with the provided UML diagram. 

#### Additionally, for answering statement c, it can be observed that all the classes (Rectangle, Circle, and Square) are functioning correctly with the Resizable interface. This demonstrates the successful implementation of the resize() method across these classes.


#### On 3 April On our Seminar sessions due to the task in week 10 we have to change Task.java in week 9. Because we will use it in GenericMethod.java