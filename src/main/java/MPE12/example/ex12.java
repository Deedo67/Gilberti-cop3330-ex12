package MPE12.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex12 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("Enter the principal: ");
        String strprin = in.nextLine();
        System.out.print("Enter the rate of interest: ");
        String strrate = in.nextLine();
        System.out.print("Enter the number of years: ");
        String stryears = in.nextLine();

        //string convert
        int prin = Integer.parseInt(strprin);
        double rate = Double.parseDouble(strrate);
        int years = Integer.parseInt(stryears);

        //math
        double finrate = rate / 100;
        double total = prin * (1 + (finrate * years));

        //output
        System.out.println("After "+years+" years at "+String.format("%.1f", rate)+"%, the investment will be worth $"+String.format("%.2f", total)+".");
    }
}
