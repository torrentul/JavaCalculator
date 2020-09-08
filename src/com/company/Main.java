package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Processor processor= new Processor();
        System.out.println(processor.calculate(line));

    }
}
