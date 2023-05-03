import javax.swing.*;
public class SwitchCase {
    public static void main(String enter[]){
        int num;
        char op = 0;
        String msg = "", msgEnt = "Enter the number 1 for Odd / Even\n Enter the number 2 for positive / negative.";

        num = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer number"));
        op = (JOptionPane.showInputDialog(msgEnt)).charAt(0);
        
        switch(op){
            case '1': {
                if(num % 2 == 0){
                    msg = msg + num + " is Even.\n";
                    JOptionPane.showMessageDialog(null, msg);
                }
                else {
                    msg = msg + num + " is Odd.\n";
                    JOptionPane.showMessageDialog(null, msg);
                }
                break;
            }

            case '2': {
                if(num > 0){
                    msg = msg + num + " is positive.\n";
                    JOptionPane.showMessageDialog(null, msg);
                }
                else {
                    msg = msg + num + " is negative.\n";
                    JOptionPane.showMessageDialog(null, msg);
                }
                break;
            }
            
            default: JOptionPane.showMessageDialog(null, "Invalid option, uncatched operation");
        }
        System.exit(0);
    }
}
