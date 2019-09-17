package assignment;
import java.util.Scanner;

public class numberDemo {
    public static  void main(String[] args){
    int x;
    int y;

    Scanner  input =new Scanner(System.in);
    System.out.println("enter a number");
    x= input.nextInt();
    System.out.println("enter another number");
    y= input.nextInt();



        displayTwiceTheNumber(x,y);
        displayNumberPlus5(x,y);
        displayNumberSquared(x,y);

 }
 public static void displayTwiceTheNumber(int x, int y){
        int x2;
        int y2;

        x2 = x*2;
        y2 = y*2;
        System.out.println(x2 + " " + y2);
 }
 public static void displayNumberPlus5(int x,int y){
     int x2;
     int y2;

     x2 = x+5;
     y2 = y+5;
     System.out.println(x2 + " " + y2);
 }
 public static void displayNumberSquared(int x,int y){
     int x2;
     int y2;

     x2 = x*x;
     y2 = y*y;
     System.out.println(x2 + " " + y2);

 }
}
