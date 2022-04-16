// // Scott Shannon            Assignment 4                10 April 2022

// //The purpose of this code is to create ArrayList from user input and return the largest Integer, and test.

// package module_4;

// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.Arrays;

// public class ScottArrayListTest {

//   public static Integer max(ArrayList<Integer> list) {

//     // check if list is empty, if so return 0
//     if (list.size() == 0) {
//       return 0;
//     }

//     // init maximum element
//     int max = list.get(0);

//     // compare every element with current max
//     for (int i = 0; i < list.size(); i++) {
//       if (list.get(i) > max) {
//         max = list.get(i);
//       }
//     }

//     return max;
//   }

//   public static void main(String[] args) {

//     ArrayList<Integer> input = new ArrayList<Integer>();

//     Scanner s = new Scanner(System.in);

//     System.out.println("");

//     while (input.size() == 0 || input.get(input.size() - 1) != 0) {

//       System.out.print("Enter an integer or enter 0 to exit: ");
//       // take in user input
//       Integer storeToArrayList = s.nextInt();
//       // store to arrayList
//       input.add(storeToArrayList);

//     }
//     // close scanner
//     s.close();

//     // test cases
//     ArrayList<Integer> testLowToHigh = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
//     ArrayList<Integer> testHighToLow = new ArrayList<>(Arrays.asList(7, 6, 5, 4, 3, 2, 1, 0));

//     System.out.println("");
//     System.out.println(input);

//     System.out.println("");
//     System.out.println("The largest Integer from user input is: " + max(input));
//     System.out.println("");
//     // print tests
//     System.out.println("The largest Integer from testLowToHigh should be 9: " + max(testLowToHigh));
//     System.out.println("The largest Integer from testHighToLow should be 7: " + max(testHighToLow));
//   }
// }