import javax.swing.*;
public class SwitchSolution {
    public static void main(String enter[]){
        int n1, n2, result;
        char op = 0;
        String msg1 = "", msg2 = "Enter 1 for sum.\n Enter 2 for mult";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer number"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer number"));
        op = (JOptionPane.showInputDialog(msg2)).charAt(0);
        
        switch (op) {
            case '1': {
                result = n1 + n2;
                msg1 = msg1 + "The sum of " + n1 + " with " + n2 + " is: " + result;
                break;
            }
                
            case '2': {
                result = n1 * n2;
                msg1 = msg1 + "The multiplication of " + n1 + " with " + n2 + " is: " + result;
                break;
            }
        
            default: JOptionPane.showMessageDialog(null, "There's an Error in the operation.");
                break;
        }
        if(op == '1' || op == '2'){
            JOptionPane.showMessageDialog(null, msg1);
        }
        System.exit(0);
    }
}
