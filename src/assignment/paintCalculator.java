package assignment;

import javax.swing.*;

public class paintCalculator {
    public static void main(String[] args){
        int height;
        int width;
        int length;
        String inHeight=JOptionPane.showInputDialog(null,"enter height of the wall","input",JOptionPane.INFORMATION_MESSAGE);
        height = Integer.parseInt(inHeight);
        String inWidth=JOptionPane.showInputDialog(null,"enter width of the wall","input",JOptionPane.INFORMATION_MESSAGE);
        width = Integer.parseInt(inWidth);
        String inlength=JOptionPane.showInputDialog(null,"enter width of the wall","input",JOptionPane.INFORMATION_MESSAGE);
        length = Integer.parseInt(inlength);

        area(length,width,height);


    }
    public static void area(int length,int width,int height){
        int roomArea;
        roomArea= ((height*length)*2 + ((height*width)*2));
        JOptionPane.showMessageDialog(null,"the area of all walls is "+roomArea);
        cost(roomArea);




    }
    public static void cost(int roomArea){
        double cost;
        double roomgallons;

        double totalgallons;

      double leftOvergallon;
        roomgallons =(roomArea/350);
      leftOvergallon= roomgallons%350;
      totalgallons= leftOvergallon+roomgallons;
//      Math.ceil(roomgallons);



        cost= totalgallons*32;

        JOptionPane.showMessageDialog(null,"the total cost is $"+cost+" with "+totalgallons+" total gallons");



    }
}
