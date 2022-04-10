// // Scott Shannon            Assignment 3                9 April 2022
// // The purpose of this code is write getters, setters, and methods that take both Integers and ints and then test all of them using 3 instances
public class ScottInteger {

  private int scott;
  // An int data field titled with your first name.

  public ScottInteger(int scott) {
    // A constructor that takes and sets the initial value.
    this.scott = scott;
  }

  public int getScott() {
    // getter
    return scott;
  }

  public void setScott(int scott) {
    // setter
    this.scott = scott;
  }

  // Non-Static methods titled isEven()
  public boolean isEven() {
    if (scott % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  // Static method title isEven() with integer param and return type
  static boolean isEven(Integer num) {
    if (num % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  // Static method title isEven()
  static boolean isEven(int num) {
    if (num % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  // Non-Static methods titled isOdd()
  public boolean isOdd() {
    if (scott % 2 != 0) {
      return true;
    } else {
      return false;
    }
  }

  // Static methods titled isOdd() with integer param and return type
  static boolean isOdd(Integer num) {
    if (num % 2 != 0) {
      return true;
    } else {
      return false;
    }
  }

  // Static methods titled isOdd()
  static boolean isOdd(int num) {
    if (num % 2 != 0) {
      return true;
    } else {
      return false;
    }
  }

  // Non-Static methods titled isPrime()
  public boolean isPrime() {
    for (int i = 2; i <= scott / 2; i++) {
      if (scott % i == 0) {
        return false;
      }
    }
    return true;
  }

  // Static methods titled isPrime()
  static boolean isPrime(int num) {
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  // Static methods titled isPrime() with integer param and return type
  static boolean isPrime(Integer num) {
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  // The method equals(int) which returns true if int values are equal and false
  // if they are not.
  public boolean equals(int num) {
    if (num == scott) {
      return true;
    } else {
      return false;
    }
  }

  // The method equals(Integer) which returns true if int values are equal and
  // false if they are not.
  public boolean equals(Integer num) {
    if (num == scott) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
  // main method containing all instances and tests

    ScottInteger a = new ScottInteger(3);
    System.out.println("Test if 3 is a prime number. Should be true: "+a.isPrime());
    System.out.println("Test if 3 is an odd number. Should be true: "+a.isOdd());
	  System.out.println("Test if 3 is an even number. Should be false: "+a.isEven());
    System.out.println("Test if the integer 42 equals 3. Should be false: "+a.equals(42));
    
    ScottInteger b = new ScottInteger(3);
    System.out.println("Test if 3 is a prime Integer. Should be true: "+b.isPrime());
    System.out.println("Test if 3 equals 3. Should be true: "+b.equals(3));
    System.out.println("Test if 3 is an odd Integer. Should be true: "+b.isOdd());
	  System.out.println("Test if 3 is an even Integer. Should be false: "+b.isEven());
    
    ScottInteger c = new ScottInteger(7);
    System.out.println("Test if 7 is a prime Integer. Should be true: "+c.isPrime());
  }
}