package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("What is your name? ");
        name = input.nextLine();

        String outname = new String(name);
        System.out.printf("Hello, %s, nice to meet you!", outname);

    }//end main method
}//end classB
