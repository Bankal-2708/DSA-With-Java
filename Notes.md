## Variable 

Variable is a kind of a container that help us to store a data. variable have a data type, name & a value 

we use that, the value or data could be use throughout the program

when we use this : 

  whenever we need to perform any of the following operation either we are suppose to SAVE the data, FETCH the data, DELETE the data & UPDATE the data 

Type of variable : 
  1) local variable : create inside the function, functional scope
  2) Instance variable : it declared inside a class but outside any function / method it belongs to a specific instance of OBJECT, life object declaration to deleted 
  3)Static variable : create when class create, its a class variable, scope program or class (ClassName.variableName)



## Function

A function is a block of code that we need to write down to perform / achieve  any of the specific task
functions are reusable and help us to organized the code

How can we use function : 
  1)Signature of a function 
  2)Declaration of a function 
  3)Function implementation 
  4)Call the function 


  ** Void does not have any return type ** 


  *** Type of a function ***

  1) Regular / Concrete function
  2) Abstract Function : don't have body we use  class to use this where we declare its body


  *** Methods Execution ***

  When a method is called:

  A new stack frame is added to the call stack to store method details.
  The method runs its code.
  After execution, the stack frame is removed, and control goes back to the calling method.
  Java automatically manages the call stack using the Java Virtual Machine (JVM).

 

## Overloading 

  Compile time Polymorphism

  resolve at compile time

  same name , different parameters

  Happens within the same class

## Overriding 

  Runtime Polymorphism

  resolve at run time 

  same name, same parameters

  Happens between a Parent and Child class (Inheritance).


  ## Super. keyword and Super() method

  super. : super. is a special keyword used by a child class to talk directly to its parent class.
          Used to call a parent class's methods or variables.

  Super() : You use super() inside a child class's constructor to pass data up to the parent class's constructor so it can initialize its variables properly 

  * it is use in child class to call the constructor of parent class,  this should be the first statement in child constructor * 

## Object 

Object is a physical entity that we use to access the function / method and variable or properties & behavior of the corresponding class

*** toString() is the method of object class it is the top most class in java ***


how we use this : 

  name of the class obj = New name of the class();

  * classname reference-variable = New classname();*


## New 

  new is a keyword that is use to create an new object of a class by allocating a memory and returning the reference to that memory 
  new keyword is also call the corresponding constructor to the respective class that is use to initialized an object state.

  create an object
  allocating memory for the obj
  call the constructor to initialized the obj


## Constructor 

 constructor is a special type of a function 
 it help us to instantiate of a class 
 the name of the constructor should always be similar to the name of tha class
 it can never return the value 
 constructor is also use to initialized the obj state
 it cannot be static, final or abstract
 constructor can be overload

 whenever we do create an object of a class, corresponding constructor of the respective class get involved / called.

 *There are FOUR type of constructor * 

 1) Default constructor
 2) No Argument constructor
 3) Parameterized constructor
 4) Copy constructor


 *** Default constructor ***

 Default constructor is automatically called by the Java Compiler. It if has not defined in our code explicitly.
  it has no parameters 

```
  class FoodItem {
    String name;
    double price;
    
    // Java automatically inserts this hidden constructor:
    // public FoodItem() { }
  }

  // Because of that hidden constructor, this line works perfectly:
  FoodItem item = new FoodItem();

```

*** No Argument Constructor ***

No Argument constructor does not accept any parameter.
It is similar to the default constructor,
If it has not been defined in our code.


```
  class FoodItem {
    String name;
    double price;

    public FoodItem() { // no argument }
  }

  // Because of that hidden constructor, this line works perfectly:
  FoodItem item = new FoodItem();

```
** In no argument we have the control of initialization of the properties ** 

*** Parameterized Constructor ***

  Parameterized constructor that accept parameter or argument 

  ```
  const(int age, String name){

  }

   ```

*** Copy Constructor ***

  Copy constructor is a special type or constructor that is use to create an object by coping the value of existing, original of tha same class 

  ```
  class FoodOrder {
    // Instance variables
    String customerName;
    String foodItem;
    double price;

    // 1. Regular Parameterized Constructor (to create the first order)
    public FoodOrder(String customerName, String foodItem, double price) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.price = price;
    }

    // 2. THE COPY CONSTRUCTOR
    // It takes an object of the exact SAME class ('FoodOrder') as a parameter
    public FoodOrder(FoodOrder originalOrder) {
        this.customerName = originalOrder.customerName; // Copy the string
        this.foodItem = originalOrder.foodItem;         // Copy the string
        this.price = originalOrder.price;               // Copy the primitive number
    }

    // Quick helper method to display details
    void displayDetails() {
        System.out.println(customerName + " ordered " + foodItem + " for Rs. " + price);
    }
  }

  ```

### Two Pointer 

 Two Sum in Sorted Arrays, Closest Two Sum, Three Sum, Four Sum, Trapping Rain Water

 *** when to use ***
 1) Sorted array
 2) Pairs or subarrays
 3) Sliding window problems 
 4) Linked-list 