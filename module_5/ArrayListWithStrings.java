// Scott Shannon            Assignment 5 Program 1                10 April 2022

// make arrayList of strings, use for each loop, get user input, use try/catch to error handle.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithStrings {

    public static void main(String[] args) {

        String stringZero = "Option 0: This is string zero";
        String stringOne = "Option 1: This is string one";
        String stringTwo = "Option 2: This is string two";
        String stringThree = "Option 3: This is string three";
        String stringFour = "Option 4: This is string four";
        String stringFive = "Option 5: This is string five";
        String stringSix = "Option 6: This is string six";
        String stringSeven = "Option 7: This is string seven";
        String stringEight = "Option 8: This is string eight";
        String stringNine = "Option 9: This is string nine";
        String stringTen = "Option 10: This is string ten";

        System.out.println("");

        ArrayList<String> tenStrings = new ArrayList<String>(Arrays.asList(stringZero, stringOne, stringTwo,
                stringThree, stringFour, stringFive, stringSix, stringSeven, stringEight, stringNine, stringTen));

        for (String element : tenStrings) {
            System.out.println(element);
        }

        System.out.println("");
        System.out.println("Which string would you like to see again? Please enter the numbered option.");
        System.out.println("");

        // open scanner
        Scanner s = new Scanner(System.in);
        // save "next" to variable userInput
        String UserInput = s.nextLine();
        // close scanner
        s.close();

        try {
          	System.out.println(tenStrings.get(Integer.parseInt(UserInput)));

        } catch (Exception e) {
            System.out.println("");
            System.out.println("Out of bounds.");
            System.out.println("");
        }
      
    }
}