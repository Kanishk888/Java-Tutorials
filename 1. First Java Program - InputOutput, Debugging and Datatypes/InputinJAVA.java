package com.company.InputinJAVA;

import java.io.FileInputStream;
import java.util.Scanner;

public class InputinJAVA {

    public static void main(String[] args) {


        Scanner       input      =   new     Scanner(System.in);
//          ^           ^             ^         ^
//     class name    Obj name        DMA    constructor



        // int input
//        System.out.print("Enter any integer value : ");
//        int i = input.nextInt();
//        System.out.println("* The value you enter is "+i);
//
        // float input
//        System.out.print("Enter any float value : ");
//        float F = input.nextFloat();
//        System.out.println("* The value you enter is "+F);
//
        // sting input
//        System.out.print("Enter any string value : ");
//        String st = input.next();
//        System.out.println("* The value you enter is " +st);
//
        // string(sentence) input with entire sentence

          String name = input.nextLine();
          System.out.println(name);

//      hasNext checks datatype of the next value.
    }
}
