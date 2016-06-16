package de.renesesgoer.mathematics;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactors {
  
  /*
   * Prints the prime factors of an entered long value
   */
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    long number = 480L;
    
    try {
      scanner.nextInt();
      System.out.println("Primfaktoren:" + getPrimeFactors(number));
    }
    catch (InputMismatchException e) {  // if input passed to scanner is not a long value
      System.out.println("Please enter integers only.");
    }
    
  }
  
  /*
   * Returnes an ArrayList with the prime factors of the long value
   */
  
  static ArrayList<Long> getPrimeFactors(long number) {
    long prime = 2L;
    ArrayList primeFactors = new ArrayList<Long>();
    while (number % prime == 0) {
      primeFactors.add(prime);
      number = number / prime;
    }
    prime = 3;
    while (number > 1) {
      if (number % prime == 0) {
        primeFactors.add(prime);
        number = number / prime;
      }
      else {
        prime += 2;
      }
    }
    return primeFactors;
  }
  
}
