import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        int number;
        float soma;

        soma = 0;

        Scanner read = new Scanner(System.in);

        for (int i = 0; i <= 5; i = i + 1){
            if (i < 5) {
                System.out.println("choose a number to the addition: ");
                number = read.nextInt();
                soma = number + soma;
            }
        }
        System.out.println("the addition result is: " + soma);
    }
}