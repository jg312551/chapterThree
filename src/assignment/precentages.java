package assignment;

import java.util.Scanner;

public class precentages {
    public static void main(String[] args){
        double number;
        double number2;

        Scanner input =new Scanner(System.in);
        System.out.println("enter a number");
        number= input.nextInt();

        System.out.println("enter another number");
        number2= input.nextInt();

        computePercent(number, number2);
    }

    public static void computePercent(double number, double number2) {
        double hold;
        double percent;
        hold = number/number2;
        percent= hold *100;
        System.out.println(number+" is "+ percent+" percent of "+number2);
    }
}
