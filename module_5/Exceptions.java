package module_5;

public class Exceptions {
    public static void main(String[ ] args) {
        try {
          int[] numbers = {0, 1, 2};
          System.out.println(numbers[3]);
        } catch (Exception e) {
          System.out.println("ERROR, out of bounds.");
        }
      }
}

