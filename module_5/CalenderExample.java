import java.util.*;

class CalendarExample {
    public static void main(String[] args){

        Calendar myCalendar = Calendar.getInstance();
    
        System.out.println("");
        System.out.println("The time is " + myCalendar.get(Calendar.HOUR) + ":" + myCalendar.get(Calendar.MINUTE));
        System.out.println("");
        //System.out.print("Hello, it is currently : " + myCalendar.getTime());  
    }
}


