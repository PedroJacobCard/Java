import javax.swing.*;
public class SwitchAndRepeat {
    public static void main(String enter[]){
        int table;
        char op = 0;
        String msg = "", msgEnt = "Enter 1 for 'for' repetition.\n Enter 2 for 'while' repetition.\n Enter 3 for 'Do / While' repetition." ;

        table = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer number"));
        op = (JOptionPane.showInputDialog(msgEnt)).charAt(0);

        switch (op) {
            case '1':{
                msg = msg + "Multiplication table of " + table + " for 'for': \n\n";
                for(int i = 1; i <= 10; i++){
                    msg = msg + table + " x " + i + " = " + table * i + "\n";
                } 
                break;
            }

            case '2': {
                msg = msg + "Multiplication table of " + table + " for 'while': \n\n";
                int i = 1;
                while(i <= 10){
                    msg = msg + table + " x " + i + " = " + table * i + "\n";
                    i++; 
                }
                break;
            }

            case '3': {
                msg = msg + "Multiplication table of " + table + " for 'Do / While': \n\n";
                int i = 1;
                do {
                    msg = msg + table + " x " + i + " = " + table * i + "\n";
                    i++;
                } while (i <= 10);
                break;
            }

            default:
                break;
        }
        if(op >= '1' && op <= '3'){
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}
