package assignment;

import java.util.Scanner;
public class celsiusToFarnihite {
    public static void main(String[] args){

        double ctemp;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("enter the temperature at 8:00AM >> ");
         ctemp= keyboard.nextDouble();
         conversion(ctemp);

        System.out.print("enter the temperature at 12:00PM >> ");
        ctemp= keyboard.nextDouble();
        conversion(ctemp);

        System.out.print("enter the temperature at 5:00PM >> ");
        ctemp= keyboard.nextDouble();
        conversion(ctemp);




    }
    public static void conversion(double ctemp){

        double ftemp;
        ftemp=(ctemp*9/5)+32;
        System.out.println("the temp in fahrenheit is "+ftemp);

        if (ftemp <= 31)
            System.out.println("it is freezing");


        if (ftemp >= 101 )
            System.out.println("it is hot outside");


    }
}
