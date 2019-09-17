package examples;

import javax.swing.*;
import java.util.Scanner;

public class demoRays {

    public static void main(String[] args){

        double salary ;
//        Scanner input = new Scanner(System.in);
//        salary = input.nextDouble;
//     pl("enter your salary");


        String inputSalary = JOptionPane.showInputDialog(null,"enter salary",
                "celery", JOptionPane.INFORMATION_MESSAGE);
        salary = Double.parseDouble(inputSalary);




        predictRaise(salary);



    }
    public static void  predictRaise(double salary){
       double newsalary;
       final double RAISE_RATE = 1.10;
       newsalary = salary * RAISE_RATE;

       System.out.println("current salary: "+ salary +"\nafter raise : "+ newsalary);

    }
    public static void pl(String p){
        System.out.println(p);

    }

}
