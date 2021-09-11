/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 6
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;
import java.time.YearMonth;

class Main {
  public static void main(String[] args) {
    
  Scanner scanner = new Scanner(System.in);

  System.out.println("What is your current age? ");
  int age = scanner.nextInt();

  System.out.println("At what age would you like to retire? ");
  int retireage = scanner.nextInt();

  int rYear = (retireage-age);

  System.out.println("You have " + rYear + " years left until you can retire.");

  int year = YearMonth.now().getYear();

  int retireYear = (rYear+year);

  System.out.println("It's " + year + ", so you can retire in " + retireYear);
  }
}