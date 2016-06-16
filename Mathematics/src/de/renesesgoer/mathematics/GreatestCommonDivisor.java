package de.renesesgoer.mathematics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GreatestCommonDivisor {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int num1 = 48;
    int num2 = 54;
    
    try {
      num1 = scanner.nextInt();
      num2 = scanner.nextInt();
      System.out.println(getGreatestCommonDivisor(num1, num2));
    }
    catch (InputMismatchException e) {
      System.out.println("Bitte nur ganzzahlige Werte eingeben.");
    }
    
  }
  
  static int getGreatestCommonDivisor(int num1, int num2) {
    
    int rest1 = (num1 > num2) ? num2 : num1; // smaller number (later the larger rest)
    int rest2 = (num1 > num2) ? (num1 % num2) : (num2 % num1); // larger number (later the new, smaller rest)
    
    if (num1 == num2) { // if both numbers are equal
      return num1;
    }
    else if (rest2 == 0) { // larger divided by smaller has no rest
      return rest1;
    }
    else { // if numbers are not equal
      while (rest2 != 0) {
        int temp = rest2;
        rest2 = rest1 % rest2;
        rest1 = temp;
      }
    }
    return rest1;
    
  }
  
}
