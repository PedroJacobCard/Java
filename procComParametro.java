import java.util.Scanner;
public class procComParametro {
    public static void mult(int n, int m) {
        int aux;
        aux = n * m;
        result = aux;
    }

    static int result, n, m;

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number fon n:");
        n = read.nextInt();
        System.out.println("Enter a number for m:");
        m = read.nextInt();
        mult(n,m);
        System.out.println("The result is: " + result);
    }
}
