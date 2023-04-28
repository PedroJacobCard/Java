import javax.swing.*;
public class AtividadePratica {
    public static void main(String entrada[]){
        int n1, n2, div;
        double pot;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
        div = (int)n1 / (int)n2;
        pot = Math.pow(n1,n2);

        msg = msg + "Quociente da divisão de n1 por n2 é " + div + "\n";
        msg = msg + "A potência de n1 por n2 é " + pot;

        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
