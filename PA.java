import java.util.Scanner;

public class PA {
    public static void timePa(int n, int a1, int r) {
        int aux;
        aux = a1 + (n - 1) * r;
        rest = aux;
    }

    static int rest;

    public static void main(String[] args) {
        int n, a1, r;

        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number for a1");
        a1 = read.nextInt();
        System.out.println("Enter a number for n");
        n = read.nextInt();
        System.out.println("Enter a number for r");
        r = read.nextInt();
        timePa(n, a1, r);
        System.out.println("The resul is: " + rest);
    }
    
}
