// Scott Shannon            Assignment 2                20 March 2022
// The purpose of this code is to use UseFans class object with Fans class object and then create a collection of the fans instances.
// Create a method that displays the collection, create a method that displays a single instance of a Fan, use "this", and then test the code.

// package module_2;

// import java.util.*;

// public class UseFans {
//     public static void main(String[] args) {

//         // Create a collection of Fan instances.
//         ArrayList<Fan> collectionOfFans = new ArrayList<Fan>();
//         // instance of the fan class from the default constructor
//         Fan fanTester1 = new Fan();

//         // add fans to collectionOfFans list
//         collectionOfFans.add(fanTester1);

//         // print override toString method on fanTester1
//         System.out.println();
//         System.out.println(fanTester1.toString());

//         // test the getters on the default constructor
//         System.out.println();
//         System.out.println("The color is " + fanTester1.getColor() + ".");
//         System.out.println("The speed is " + fanTester1.getSpeed() + ".");
//         System.out.println("The radius is " + fanTester1.getRadius() + ".");
//         System.out.println("The fan is on setting " + fanTester1.getOn() + ".");

//         // example of setters working on default constructor
//         fanTester1.setColor("yellow");
//         fanTester1.setSpeed(Fan.MEDIUM);
//         fanTester1.setRadius(37);
//         fanTester1.setOn(true);

//         // Write code that displays the functionality of the Fan class methods.
//         System.out.println();
//         System.out.println(fanTester1.toString());

//         // instance of the fan class from the argument constructor
//         Fan fanTester2 = new Fan(Fan.SLOW, false, 10, "Red");
//         collectionOfFans.add(fanTester2);

//         System.out.println();
//         System.out.println(fanTester2.toString());

//         // test the getters on the default constructor
//         System.out.println();
//         System.out.println("The color is " + fanTester2.getColor() + ".");
//         System.out.println("The speed is " + fanTester2.getSpeed() + ".");
//         System.out.println("The radius is " + fanTester2.getRadius() + ".");
//         System.out.println("The fan is on setting " + fanTester2.getOn() + ".");

//         // example of setters working on argument constructor
//         fanTester2.setColor("black");
//         fanTester2.setSpeed(Fan.FAST);
//         fanTester2.setRadius(67);
//         fanTester2.setOn(false);

//         // print override toString method fanTester2
//         System.out.println();
//         System.out.println(fanTester2.toString());

//         // call method to display each items attributes from the collection of fan
//         // instances
//         collectionOfFansPrinter(collectionOfFans);

//         // call method to display the fan instance
//         displayFan(fanTester1);
//         displayFan(fanTester2);
//     }

//     // create a method that takes the collection of fan instances as a parameter and
//     // then prints them out without using .tostring
//     public static void collectionOfFansPrinter(ArrayList<Fan> collectionOfFans) {
//         for (int i = 0; i < collectionOfFans.size(); i++) {

//             System.out.println("");
//             System.out.println("Fan " + (i + 1) + "'s specifications are... ");
//             System.out.println("Color : " + collectionOfFans.get(i).getColor());
//             System.out.println("Speed : " + collectionOfFans.get(i).getSpeed());
//             System.out.println("Radius : " + collectionOfFans.get(i).getRadius());
//             System.out.println("State : " + collectionOfFans.get(i).getOn());
//         }
//     }

//     // Create a method that takes a single instance of a Fan for displaying without
//     // using the toString() method.
//     public static void displayFan(Fan fan) {

//         System.out.println("");
//         System.out.println("Color : " + fan.getColor());
//         System.out.println("Speed : " + fan.getSpeed());
//         System.out.println("Radius : " + fan.getRadius());
//         System.out.println("State : " + fan.getOn());
//     }

// }
