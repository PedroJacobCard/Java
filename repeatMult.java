import java.util.Scanner;

public class repeatMult {
    public static void main(String[] args){
        int mult = 1;
        int i = 1;
        int num = 0;

        Scanner read = new Scanner(System.in);

        do {
            System.out.println("Type a number to the multiplication");
            num = read.nextInt();
            mult = mult * num;
            i = i + 1;
        } while (i <= 5);
            System.out.println("The result is: " + mult);
    }
}