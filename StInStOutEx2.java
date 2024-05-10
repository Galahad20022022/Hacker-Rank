package org.example;

import java.io.*;
import java.util.*;

public class StInStOutEx2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            double  d = scanner.nextDouble();
            //We know that input on the third line is a string and therefore there is no need to scan for a data type
            //Instead using the .nextLine() method to store the information on line 3 as a string
            scanner.nextLine();
            String myString = scanner.nextLine();
            System.out.println("String: " + myString);
            System.out.println("Double: " + d);
            System.out.println("Int: " + x);
            scanner.close();
        }
}
