package de.renesesgoer.mathematics;

import java.util.ArrayList;

public class PrimeFactors {
  
  public static void main(String[] args) {
    
    long number = 480L;
    long number2 = 12600L;
    System.out.println(number);
    System.out.println("Primfaktoren:" + getPrimeFactors(number));
    System.out.println("Primfaktoren:" + getPrimeFactors(number2));
    System.out.println("ggT: " + getggT(number, number2));
    
  }
  
  static long getggT(long number, long number2) {
    
    return 0;
  }
  
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
