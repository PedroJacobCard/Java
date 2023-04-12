import java.util.Scanner;
public class proceedingMult {
    public static void mult(int n, int m) {
        int plus;
        plus = n * m;
        result = plus;
    }

    static int result;

    public static void main(String[] args) {
        int n, m;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the first number:");
        n = read.nextInt();
        System.out.println("Enter the second number:");
        m = read.nextInt();
        mult(n, m);
        System.out.println("The result is: " + result);
    }
}
