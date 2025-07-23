package com.methods.methodexample.javaexam;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Value");
    int inp = sc.nextInt();

    if (inp % 2 == 0) {
      System.out.println(inp + " is a even number");
    } else {
      System.out.println(inp + " is not a even number");
    }
  }
}
