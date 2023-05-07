import javax.swing.*;
public class Modules {
    public static void sum(){
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
        JOptionPane.showMessageDialog(null, "The sum is: " + (n1+n2));
    }

    public static void subtraction(int x, int y){
        int s;
        s = x - y;
        JOptionPane.showMessageDialog(null, "The difference is: " + s);
    }

    public static int product(){
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        return (n1 * n2);
    } 

    public static double quotient(int x, int y){
        double q;
        q = (double)x / (double)y;
        return q;
    }

    public static void main(String[] args){
        int n1, n2, s;
        double r;

        sum();
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer number"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another integer number"));
        subtraction(n1,n2);
        s = product();
        JOptionPane.showMessageDialog(null, "The product is: " + s);
        r = quotient(n1,n2);
        JOptionPane.showMessageDialog(null, "The quotient is: " + r);
        System.exit(0);
    }
}
