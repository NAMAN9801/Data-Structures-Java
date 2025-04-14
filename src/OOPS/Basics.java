package OOPS;


public class Basics {
    // main function from where the compiler begins its work
    // By default, main is public and static
    public static void main(String[] args) {
        System.out.println("OOPS lecture");

        Pen p1 = new Pen(); // new keyword creates a storage in memory for p1 object
        // Pen() is a constructor
        p1.setColor("Red");
//        System.out.println(p1.color);
//        p1.setTip(5);         Because the attributes are now private this wont work
//        System.out.println(p1.tip);
//        p1.setColor("Yellow");
//        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());


        BankAccount myAcc = new BankAccount();
        myAcc.username = "naman dhingra";
        // myAcc.password - not visible as it is private and only class has access to it
        myAcc.setPassword("hey1234567890");



        // Constructor
        Student std1 = new Student("Naman");



        // Inheritance and super keyword
        Fish pirana = new Fish();
        pirana.swim();
        pirana.eat();
     }
}


class Pen{
    private String color;
    private int tip;

    // stactic are only linked to classes in java which is why when written static then
    // the method will be affilated to class only not to instance
    public void setColor(String newColor){
        this.color = newColor;
        // incase of not using this keyword meaning every object of the class will have the same color as the color assigned once in different object
    }
    // these 2 functions are setters
    void setTip(int newTip){
        this.tip = newTip;
    }

    // the below 2 are getters
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}


// Recommended to make new classes below main class to avoid some inbuilt issues
class Student{
    String name;
    int roll;
    float percentage; //or cgpa
    private String password;
    int marks[];

    // Constructor below
    Student(String Name){
        System.out.println("Constructor is called");
    }
    //default constructors made by java has no initialisation

    // Shallow copy constructor
//    Student(Student s1){
//        marks = new int[3];
//        this.marks = s1.marks;
//        this.name = s1.name;
//        this.roll = s1.roll;
//    }

    // Deep copy constrctor
    Student(Student s1){
//        For name and roll, these fields are either primitives (roll is int) or immutable objects (name is a String), so they are copied by value. This means s2 has its own independent copy of these fields
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
//        The marks array, however, is mutable. Without the deep copy, both s1 and s2 would share the same array reference. But here, a new array is created for s2 in the constructor, and its elements are explicitly copied one-by-one, ensuring both objects have separate arrays.
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
        // Lazy copy at the end
    }

    void calculatePer(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}


class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd; // how java is secure; outside class getting set by 3rd party function

    }
}



//Lazy Copy is used when you might generally need Deep Copy, but are not sure whether it is really necessary. Deep Copy is generally an
// expensive operation. If you do it unconditionally in 100% of cases and then discover that you only needed it in 10% of objects, then the
// efforts spent on Deep-Copying the other 90% of objects were wasted.
//Copy of both deep and shallow copy
//This is when Lazy Copy comes in. Lazy Copy is a postponed, delayed, on-demand version of Deep Copy. With Lazy Copy you don't perform Deep
// Copy right away. Instead, you prepare (or schedule) a Deep Copy by storing all pertinent information in the recipient object (which most
// of the time boils down to a mere Shallow Copy) and wait till it becomes known whether the Deep Copy is really necessary for that specific
// object. If it turns out to be necessary, you perform the actual Deep Copy. If the need for Deep Copy never arises, then it doesn't
// happen, thus saving you the effort.



class Animal{
    // base class
    String color;

    Animal(){
        System.out.println("Animal constructor");
    }
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}


class Fish extends Animal {
    // derived class
    int fins;

    Fish(){
        super(); // calls constructor of parent class and executes it
        // if we dont write this then java automatically calls it
        super.color = "pick"; // can be changed via super too
        System.out.println("via fish ");
    }

    void swim(){
        System.out.println("Yes it does swim brotha");
    }

    void eat(){
        System.out.println("Eats other small fishes"); // method overriding
    }
}

