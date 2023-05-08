import javax.swing.*;
public class Program07 {
    public static void sum(int vet[]){
        int s = 0;
        for(int i = 0; i < vet.length; i++){
            s = s + vet[i];
        }
        JOptionPane.showMessageDialog(null, "The summary is " + s);
    }

    public static int product(int vet[]){
        int prod = 1;
        for(int i = 0; i < vet.length; i++){
            prod = prod * vet[i]; 
        }
        return prod;
    }

    public static void main(String enter[]){
        int p, vet[], n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter the length you want"));
        vet = new int[n];
        for(int i = 0; i < vet.length; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer numbers to " + i));
        }
        sum(vet);
        p = product(vet);
        JOptionPane.showMessageDialog(null, "The product is " + p);
        System.exit(0);
    }
}
