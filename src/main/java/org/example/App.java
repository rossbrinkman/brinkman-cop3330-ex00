package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "What is your name? " );
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        System.out.println( "Hello, " + userInput + ", nice to meet you!" );

        scanner.close();
    }
}
