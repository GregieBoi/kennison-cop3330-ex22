/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex22 {

    // main
    public static void main(String[] args) {

        // set format
        DecimalFormat df = new DecimalFormat("0.#");

        // print output and pass to is_large for string info
        System.out.println("The largest number is " + df.format(is_large(first(), second(), third())) + ".");

    }

    // gets first num
    public static double first() {

        // prompts for input and returns scan
        System.out.print("Enter the first number: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    // gets second num
    public static double second() {

        // prompts for input and returns scan
        System.out.print("Enter the second number: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    // gets third num
    public static double third() {

        // prompts for input and returns scan
        System.out.print("Enter the third number: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    // determines the largest number and returns it
    public static double is_large(double first, double second, double third) {

        // checks to see if any numbers are the same and exits if they are
        if (first == second || second == third)
            System.exit(0);

        // if else to determine if first or second is larger
        if (first > second) {
            // if else to determine if first or third is larger
            if (first > third)
                return first;
            else
                return third;
        }
        else {
            // if else to determine if second or third is larger
            if (second > third)
                return second;
            else
                return third;
        }
    }
}
