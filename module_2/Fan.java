// // Scott Shannon            Assignment 1                15 March 2022
// // The purpose of this code is to write constants, constructors with and without args, override a toString method, use getters, use setters, and "test" the code.
// package module_2;

// public class Fan {
    
//     // Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to
//     // hold the values of 0, 1, 2, and 3 respectively.
//     static final int STOPPED = 0;
//     static final int SLOW = 1;
//     static final int MEDIUM = 2;
//     static final int FAST = 3;

//     // A private field named speed that holds one of the constant values with the
//     // default being STOPPED.
//     private int speed;

//     // A private Boolean field titled on that specifies whether the fan is on or
//     // off.
//     private boolean on;

//     // A private field named radius that holds the radius of the fan with a default
//     // value of 6.
//     private int radius;

//     // A String field that holds the color, with the default being white.
//     public String color;

//     // A no-argument constructor that sets all fields with a default value.
//     public Fan() {
//         this.speed = STOPPED;
//         this.on = true;
//         this.radius = 6;
//         this.color = "White";
//     }

//     // A constructor taking arguments and setting values.
//     public Fan(int speed, boolean on, int radius, String color) {
//         this.speed = speed;
//         this.on = on;
//         this.radius = radius;
//         this.color = color;
//     }

//     // Write a toString() method that returns a description of the Fans state.
//     @Override
//     public String toString() {
//         if (this.on == true) {
//             return "The " + color + " fan is on speed setting " + speed + " with a radius of " + radius
//                     + " and is currently on.";
//         } else {
//             return "The " + color + " fan is on speed setting " + speed + " with a radius of " + radius
//                     + " and is currently off.";
//         }
//     }

//     // Setter and getter methods for all mutable fields.
//     int getSpeed() {
//         return speed;
//     }

//     void setSpeed(int speed) {
//         this.speed = speed;
//     }

//     boolean getOn() {
//         return on;
//     }

//     void setOn(boolean on) {
//         this.on = on;
//     }

//     int getRadius() {
//         return radius;
//     }

//     void setRadius(int radius) {
//         this.radius = radius;
//     }

//     String getColor() {
//         return color;
//     }

//     void setColor(String color) {
//         this.color = color;
//     }
// }
