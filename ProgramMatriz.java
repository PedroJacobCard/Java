import javax.swing.*;
public class ProgramMatriz {
    public static void main(String enter[]){
        int vetor[] = {2,4,6,8,10};
        int matriz[][] = new int [2][3];
        String msg = "vetor = ";

        for(int i = 0; i < vetor.length; i++){
            msg = msg + vetor[i] + " ";
        }
        
        JOptionPane.showMessageDialog(null, msg);
        msg = "Matriz = \n\n";

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer number to the position: " + i + " e " + j));
                msg = msg + matriz[i][j] + " ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
