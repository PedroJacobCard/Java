public class Program2 {
    public static void main(String entrada[]){
        int n1, n2, mod, div;
        double raiz, pot;
        String msg = "";

        n1 = Integer.parseInt(entrada[0]);
        n2 = Integer.parseInt(entrada[1]);
        mod = n1 % n2;
        div = (int)n1 / (int)n2;
        raiz = Math.sqrt(n1);
        pot = Math.pow(n1, n2);

        msg = "n1 é = " + n1 + " e n2 é = " + n2 + "\n";
        msg = msg + " Resto da divisão entre n1 e n2 é " + mod + "\n";
        msg = msg + " Quociente da divisão de n1 por n2 é " + div + "\n";
        msg = msg + " Raiz quadrada de n1 é " + raiz + "\n";
        msg = msg + " Potencia de n1 e n2 é " + pot + "\n";
        System.out.println(msg);
        System.exit(0);
    }
}
