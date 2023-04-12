import java.util.Scanner;
public class FunctionWithParameter {
    static int res, aux;
    public static int mult(int x, int y){
        aux = x * y;
        return aux;
    }

    public static void main(String[] args){
        int n, m;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of the first number");
        n = read.nextInt();
        System.out.println("Enter the number of the second number");
        m = read.nextInt();
        res = mult(n, m);
        System.out.println("The result is: " + res);
    }
}
