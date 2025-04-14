package OOPS;

public class Basics2 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.walk();

//        Animals a1 = new Animals(); // Gives error as abstract classes cannot have objs

        Queen q1 = new Queen();
        q1.moves();


        Student1 s1 = new Student1();
        s1.schoolName = "Manohar Vatika";
        Student1 s2 = new Student1();
        System.out.println(s2.schoolName); // will print the same as s1 as this is static and if one obj changes it, it gets assigned to all other objects of the class
    }
}


abstract class Animals{
    //  classes where we cannot make objects
    void eat(){
        System.out.println("animals eat");
    }

    abstract void walk(); // no implementation meaning har animal pe walk naam ka function hoga but vo define krengi uski subclasses
}


class Horse extends Animals{
    // Now the walk method implementation is must else this will give error
    void walk(){
        System.out.println("Walk implementation in child class");
    }
}


class Chicken extends Animals{
    void walk(){
        System.out.println("2nd implementation");
    }
}


interface ChessPlayer{
    void moves();
    // by default public abstract and without implementation
}


class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down");
        // if we dont add any keyword in mives then it will be turned as default
    }
}


class Student1{
    String name;
    int rollno;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

}