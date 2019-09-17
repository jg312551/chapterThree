package assignment;


import javax.swing.*;

public class metricConversion {
    public static void main(String[]args) {
        double gallon;
        double inch;
        String input=JOptionPane.showInputDialog(null,"enter gallons","inputDialog",JOptionPane.INFORMATION_MESSAGE);
        gallon = Double.parseDouble(input);

        literConversion(gallon);

        String input1=JOptionPane.showInputDialog(null,"enter inches","inputDialog",JOptionPane.INFORMATION_MESSAGE);
        inch = Double.parseDouble(input1);





        inchConversion(inch);

    }
    public static void literConversion(double gallon){
        double newLiter;
        double liters =3.7854;
        newLiter = gallon * liters;
        JOptionPane.showMessageDialog(null,"you have "+ newLiter+" liters");


    }
    public static void inchConversion(double inch){
        double newCenti;
        double centi = 2.54;
        newCenti = inch *centi;
        JOptionPane.showMessageDialog(null,"you have "+ newCenti+ "centimeters");

    }
}
