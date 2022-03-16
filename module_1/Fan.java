package module_1;

public class Fan {
    public static void main(String[] args) {
        //instance of the fan class from the default constructor
        Fan f1 = new Fan();

        //instance of the fan class from the argument constructor
        Fan f2 = new Fan(Fan.SLOW, false, 10, "Red");

        //Write code that displays the functionality of the Fan class methods.
        System.out.println();
        System.out.println(f1.toString());

        System.out.println();
        System.out.println(f2.toString());

        
        f2.setColor("black");
        f2.setSpeed(Fan.FAST);
        f2.setRadius(1000);
        f2.setOn(false);

        System.out.println();
        System.out.println(f2.toString());

        f1.setColor("yellow");
        f1.setSpeed(Fan.MEDIUM);
        f1.setRadius(37);
        f1.setOn(true);

        System.out.println();
        System.out.println(f1.toString());
      	// test getters and setters
    }

    // Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3 respectively.
    static final int STOPPED = 0;
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    // A private field named speed that holds one of the constant values with the default being STOPPED.
    private int speed;

    // A private Boolean field titled on that specifies whether the fan is on or off.
    private boolean on;

    // A private field named radius that holds the radius of the fan with a default value of 6.
    private int radius;

    //A String field that holds the color, with the default being white.
    public String color;

    //A no-argument constructor that sets all fields with a default value.
    public Fan(){
        this.speed = STOPPED;
        this.on = true;
        this.radius = 6;
        this.color = "White";
    }

    //A constructor taking arguments and setting values.
    public Fan(int speed, boolean on, int radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //Write a toString() method that returns a description of the Fans state.
    @Override
    public String toString(){
        if (this.on == true){
            return "The " +color+ " fan is on speed setting " +speed+ " with a radius of " +radius+ " and is currently on.";
        } else {
            return "The " +color+ " fan is on speed setting " +speed+ " with a radius of " +radius+ " and is currently off.";
        }
    }

    //Setter and getter methods for all mutable fields.
    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    boolean getOn() {
        return on;
    }

    void setOn(boolean on) {
        this.on = on;
    }

    int getRadius() {
        return radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}