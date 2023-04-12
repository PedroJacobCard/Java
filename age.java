import java.util.Scanner;
public class age {
    public static void ageCal(int currentYear, int bornYear) {
        int aux;
        aux = currentYear - bornYear;
        result = aux;
    }

    static int result;

    public static void main(String[] args) {
        int currentYear, bornYear;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the current year: ");
        currentYear = read.nextInt();
        System.out.println("Enter the year of birth:");
        bornYear = read.nextInt();
        ageCal(currentYear, bornYear);
        System.out.println("The age is: " + result);
    }
}
