package examples;

import java.util.Scanner;

public class calculator {
    public static void main(String[]args ){

        int num1;
        int num2;
        Scanner input =new Scanner(System.in);

        System.out.println("enter a number>>> ");
        num1 = input.nextInt();

        System.out.println("enter a number>>> ");
        num2 = input.nextInt();

        calculateADD(num1,num2);
        calculateSUB(num1,num2);
        calculateMULT(num1,num2);
        calculateDIV(num1,num2);
        calculateMOD(num1,num2);


    }

    public static void calculateADD(int num1,int num2){
        int total= num1 + num2;
        System.out.println(num1+"+"+num2+"="+total);

    }

    public static void calculateSUB(int num1,int num2){
        int total= num1 - num2;
        System.out.println(num1+"-"+num2+"="+total);
    }

    public static void calculateMULT(int num1,int num2){
        int total= num1 * num2;
        System.out.println(num1+"*"+num2+"="+total);
    }
    public static void calculateDIV(int num1,int num2){
        int total= num1 / num2;
        System.out.println(num1+"/"+num2+"="+total);

    }
    public static void calculateMOD(int num1,int num2){
        int total= num1 % num2;
        System.out.println(num1+"%"+num2+"="+total);
    }
}
