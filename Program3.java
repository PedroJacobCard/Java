import javax.swing.*;
public class Program3 {
    public static void main(String entrada[]){
        int n1, n2, mod;
        double raiz1, raiz2;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
        mod = n1 % n2;
        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);

        msg = msg + "Resto da divisão de n1 por n2 é " + mod + "\n";
        msg = msg + "Raiz quadrada e n1 é " + raiz1 + " e a raiz quadrada de n2 é " + raiz2 + "\n";
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}
