package assignment;

import javax.swing.*;

public class LBSconversion {
    public static void main(String[] args) {
        double LBS;
        String StringLBS = JOptionPane.showInputDialog(null, "enter # of pounds", "pounds", JOptionPane.INFORMATION_MESSAGE);
        LBS = Double.parseDouble(StringLBS);
        kilo(LBS);
        ounce(LBS);
        miligrams(LBS);

    }

    public static void kilo(double LBS) {
        final double KILO_MES = 0.453592;
        double NEWkilo;
        NEWkilo = LBS * KILO_MES;
        JOptionPane.showMessageDialog(null, LBS+" pounds in kilometers is "+NEWkilo);

    }

    public static void ounce(double LBS) {
        double NEWounces = LBS * 16;
        JOptionPane.showMessageDialog(null, LBS+" pounds in ounces is "+NEWounces);
    }

    public static void miligrams(double LBS) {
        double NEWmili = LBS * 53592;
        JOptionPane.showMessageDialog(null, LBS+" pounds in milligrams is "+NEWmili);

    }
}
