import java.util.Scanner;
public class FunctionNoParameter {
    public static int mult(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = read.nextInt();
        System.out.println("Enter the seconde number");
        int second = read.nextInt();
        return first * second;
    }

    static int res;

    public static void main(String[] args) {
        res = mult();
        System.out.println("The result is " + res);
    }
}
