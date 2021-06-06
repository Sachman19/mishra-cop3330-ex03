/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sachin Mishra
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a quote. ");
        String quote = input.nextLine();

        System.out.print("Who said the quote? ");
        String name = input.nextLine();

        System.out.printf("%s says: \"%s\"." , name, quote);
    }
}
