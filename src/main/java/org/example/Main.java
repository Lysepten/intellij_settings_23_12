package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.printf("Hello and welcome!\n");

    Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= 2; i++) {
      for (int k = 1; k <= 4; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}