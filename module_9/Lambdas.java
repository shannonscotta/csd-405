// Scott Shannon            1 May 2022          Mod 9 Assignment Code
// method accepts an anonymous function () -> and executes it .forEach element of the arrayList

import java.util.ArrayList;

public class Lambdas {
    public static void main(String args[]) {
        ArrayList<String> strarray = new ArrayList<>();
        strarray.add("No");
        strarray.add("Yes");
        strarray.add("Yes");
        strarray.forEach((n) -> {
            if (n.equals("No")) {
                System.out.println("False");
            } else {
                System.out.println("True");
            }
        });
    }
}