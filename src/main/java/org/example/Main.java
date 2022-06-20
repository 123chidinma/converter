package org.example;

//import java.util.Scanner;

import java.util.Scanner;

public class Main {
    private static int number;

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = Scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("fizzBuzz");
        }
        else if (number % 5 == 0 || number % 3 == 0 ){
            System.out.println("Buzz");
         System.out.println("Fizz");
    }
        //}
        else
            System.out.print(number);
        //}
    }
}

