package module_3;

/*
Write test code that creates three instances, two with the same value, and one with a different value.
Write test code that ensures all methods function correctly.
*/

public class JoshInteger {

  private int josh;
  // An int data field titled with your first name.

  public JoshInteger(int josh) {
    // A constructor that takes and sets the initial value.
    this.josh = josh;
  }

  public int getJosh() {
    // getter
    return josh;
  }

  public void setJosh(int josh) {
    // setter
    this.josh = josh;
  }

  // Non-Static methods titled isEven()
  public boolean isEven() {
    if (josh % 2 == 0) {
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
    if (josh % 2 != 0) {
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
    for (int i = 2; i <= josh / 2; i++) {
      if (josh % i == 0) {
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
    if (num == josh) {
      return true;
    } else {
      return false;
    }
  }

  // The method equals(Integer) which returns true if int values are equal and
  // false if they are not.
  public boolean equals(Integer num) {
    if (num.valueOf() == josh) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    // test isPrime int 3
    JoshInteger a = new JoshInteger(3);
    System.out.println(a.equals(new Integer(42)));

  }
}