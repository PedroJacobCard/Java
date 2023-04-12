import java.util.Scanner;
public class Calculator {
    public static float cal() {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the first number");
        float first = read.nextFloat();
        System.out.println("Enter the symbol of operation");
        String op = read.next();
        System.out.println("Enter the second number");
        float second = read.nextFloat();
        switch(op){
            case "+": return first + second;
            case "-": return first - second;
            case "*": return first * second;
            case "/": return first / second;
        }
        return 0; // here we use "return 0" only because it's necessary to return a final value for the function
    }

    static float result;

    public static void main(String[] args){
        result = cal();
        System.out.println("The result is: " + result);
    }
}
